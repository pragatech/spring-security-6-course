package com.praga.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
    /**
     * Custom security configurations
     * @param httpSecurity
     * @return
     * @throws Exception
     */
    @Bean
    SecurityFilterChain handleHttpRequests(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
                requestMatcher -> requestMatcher
                        .requestMatchers("/myAccount","/myBalance","/myCard","/myLoan").authenticated()
                        .requestMatchers("/notices","/myContact").permitAll()
                        //.anyRequest().denyAll()
                        //.anyRequest().permitAll()
        )
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());
        return httpSecurity.build();
    }
}
