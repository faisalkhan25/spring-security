package com.security.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


public class FormLoginSecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(request ->
//            request.requestMatchers(HttpMethod.POST,"/api/v1/users").authenticated()
//                    .requestMatchers(HttpMethod.DELETE, "/api/v1/users/*").authenticated()
//                    .requestMatchers(HttpMethod.GET,  "/api/v1/users/*").authenticated()
//                    .anyRequest().permitAll()
//        )
//                .formLogin(Customizer.withDefaults());
//        return http.build();
//    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user1 = User.builder()
//                .username("faisal khan")
//                .password("{noop}faisal123")
//                .roles("ADMIN")
//                .build();
//        UserDetails user2 = User.builder()
//                .username("moin khan")
//                .password("{noop}moin123")
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user1, user2);
//    }
}
