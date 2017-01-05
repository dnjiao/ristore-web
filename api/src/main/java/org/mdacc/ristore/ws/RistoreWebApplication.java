package org.mdacc.ristore.ws;

import org.mdacc.ristore.ws.fm.api.FoundationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring Boot main Application
 *
 */

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
@EnableSpringDataWebSupport
@EnableCaching
@EntityScan({"org.mdacc.ristore.ws.fm.models"}) 
public class RistoreWebApplication extends SpringBootServletInitializer
{
   @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
    public static void main( String[] args )
    {
    	SpringApplication.run(RistoreWebApplication.class, args);
    }
    
    // following method only needed if deployed as war
 	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
         return application.sources(RistoreWebApplication.class);
     }
}
