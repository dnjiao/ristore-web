package org.mdacc.ristore.ws.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.ldap.userdetails.LdapUserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
     @Autowired
     @Qualifier("authenticationManagerBean")
     private AuthenticationManager authenticationManager;
     
//     @Bean
//     public LdapUserDetailsService ldapUserDetailsService() {
//    	 return new LdapUserDetailsService();
//     };
     
     @Override
     public void configure(AuthorizationServerSecurityConfigurer oauthServer) 
       throws Exception {
    	 oauthServer.allowFormAuthenticationForClients();
//         oauthServer.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
     }
    
     @Override
     public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
          endpoints.tokenStore(new InMemoryTokenStore())
          .authenticationManager(authenticationManager);
//          .userDetailsService(ldapUserDetailsService);
     }
     @Override
     public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
          clients
          	.inMemory()
          	.withClient("ristoreclient")
          	.scopes("read")
          	.authorizedGrantTypes("password", "refresh_token", "client_credentials")
          	.secret("ristoresecret")
          	.accessTokenValiditySeconds(60);	
      }
 }
