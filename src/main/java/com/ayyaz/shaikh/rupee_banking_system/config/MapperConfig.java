package com.ayyaz.shaikh.rupee_banking_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public org.modelmapper.ModelMapper modelMapper() {

        return new org.modelmapper.ModelMapper();
    }
}