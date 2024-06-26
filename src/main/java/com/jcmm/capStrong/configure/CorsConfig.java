package com.jcmm.capStrong.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000", "https://datagradefrontend-6925e3c9f972.herokuapp.com", "https://datagradebackend-f2ecd09dee7f.herokuapp.com") // Add your frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH") // Add allowed methods
                .allowedHeaders("*");// Add allowed headers
    }
}