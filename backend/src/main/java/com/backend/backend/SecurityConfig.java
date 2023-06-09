package com.backend.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // allow anyone to access /users/* get endpoints
        return http
            .authorizeHttpRequests(auth -> {
                auth.requestMatchers("/users/**").permitAll();
                auth.anyRequest().permitAll();
            })
            .csrf(csrf -> csrf.disable()) //! this allows anyone use of any POST, PUT, DELETE requests
            .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        // Use BCrypt password encoder
        return new BCryptPasswordEncoder();
    }

}


