package org.mdacc.ristore.ws.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.configurers.ldap.LdapAuthenticationProviderConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;
import org.springframework.security.ldap.search.FilterBasedLdapUserSearch;
import org.springframework.security.ldap.userdetails.DefaultLdapAuthoritiesPopulator;
import org.springframework.security.ldap.userdetails.LdapUserDetailsService;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

@Configuration
//@EnableWebSecurity
@PropertySource(value = { "classpath:/config/application.properties" })
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
    private RestAuthenticationSuccessHandler authenticationSuccessHandler;
	@Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
// Following line to disable authentication
		.authorizeRequests()
        .anyRequest().authenticated();

		
// uncomment the following block to enable authentication
/*			.httpBasic()
			.and()
//			.addFilterBefore(new CORSFilter(), ChannelProcessingFilter.class)
			.csrf().disable()
			.sessionManagement().sessionCreationPolicy(
					SessionCreationPolicy.STATELESS)
			.and()
			.exceptionHandling()
	        .authenticationEntryPoint(restAuthenticationEntryPoint)
	        .and()
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/login").permitAll()
				.antMatchers("/logout").permitAll()
				.antMatchers("/ristore/**").authenticated()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.successHandler(authenticationSuccessHandler)
				.failureHandler(new SimpleUrlAuthenticationFailureHandler());*/
	}
	
	@Override  
	@Bean  
	public AuthenticationManager authenticationManagerBean() throws Exception {  
		return super.authenticationManagerBean();  
	}

	@Bean
    public RestAuthenticationSuccessHandler mySuccessHandler(){
        return new RestAuthenticationSuccessHandler();
    }
    @Bean
    public SimpleUrlAuthenticationFailureHandler myFailureHandler(){
        return new SimpleUrlAuthenticationFailureHandler();
    }

    @Bean
    public static DefaultLdapAuthoritiesPopulator authPopulator() throws Exception{

        DefaultLdapAuthoritiesPopulator authPop = new DefaultLdapAuthoritiesPopulator(getSource(),"dc=groups"); 
        authPop.setGroupRoleAttribute("cn");
        authPop.setGroupSearchFilter("(member={0})");
        return authPop;
    }
    
    public static DefaultSpringSecurityContextSource getSource() throws Exception {
    	DefaultSpringSecurityContextSource source = new DefaultSpringSecurityContextSource("ldap://ldap.mdanderson.edu:389/dc=mdanderson,dc=edu");
        source.setUserDn("cn=ris_flow,ou=service accounts,ou=institution,ou=service accounts,dc=mdanderson,dc=edu");
        source.setPassword("!BMpl@tform2O15");
        source.setReferral("follow"); 
        source.afterPropertiesSet();
        return source;
    }

    @Bean
    public static LdapUserDetailsService CustomLdapUserDetailsService() throws Exception{
        LdapUserDetailsService userDetails = new LdapUserDetailsService(userSearch(),authPopulator());
        return userDetails;

    } 
    @Bean
    public static FilterBasedLdapUserSearch userSearch() throws Exception{
        FilterBasedLdapUserSearch search = new FilterBasedLdapUserSearch("","cn={0}",getSource());
        return search;      
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	DefaultSpringSecurityContextSource contextSource = getSource();
		auth
		.ldapAuthentication()
			.userDnPatterns("cn={0},ou=institution,ou=people")
			.groupSearchBase("ou=groups")
			.contextSource(contextSource);
    }
 	
//	@Configuration
//    protected static class AuthenticationConfiguration extends
//            GlobalAuthenticationConfigurerAdapter {
//		
//		@Override
//        public void init(AuthenticationManagerBuilder auth) throws Exception { 
//
//			DefaultSpringSecurityContextSource contextSource = getSource();
//            
//
////            LdapAuthenticationProviderConfigurer<AuthenticationManagerBuilder> ldapAuthenticationProviderConfigurer = auth.userDetailsService(CustomLdapUserDetailsService()).and().ldapAuthentication();
//			LdapAuthenticationProviderConfigurer<AuthenticationManagerBuilder> ldapAuthenticationProviderConfigurer = auth.ldapAuthentication();
//            ldapAuthenticationProviderConfigurer
//            	.userDnPatterns("cn={0},ou=institution,ou=people")
//                .userSearchBase("")
//                .contextSource(contextSource)
//                ; 
//        }
//    }

}
