package webApi.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Endpoints'inize göre değiştirin
                        .allowedOrigins("http://localhost:3000") // Frontend URL
                        .allowedMethods("POST", "GET", "PUT", "DELETE")
                        .allowedHeaders("*");
            }
        };
    }
}
