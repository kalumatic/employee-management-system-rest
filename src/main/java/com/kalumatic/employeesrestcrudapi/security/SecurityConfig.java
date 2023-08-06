package com.kalumatic.employeesrestcrudapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails kalu = User.builder()
                .username("kalu")
                .password("{noop}password")
                .roles("EMPLOYEE")
                .build();

        UserDetails nikola = User.builder()
                .username("nikola")
                .password("{noop}password")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails lazar = User.builder()
                .username("lazar")
                .password("{noop}password")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(kalu, nikola, lazar);
    }
}
