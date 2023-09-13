package com.crudapispringbootpostgresjpa.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Configura las reglas de CORS según tus necesidades
        config.addAllowedOrigin("*"); // Permite solicitudes desde cualquier origen (esto puede ser ajustado)
        config.addAllowedMethod("GET, POST, PUT, DELETE, OPTIONS"); // Métodos HTTP permitidos
        config.addAllowedHeader("*"); // Cabeceras permitidas

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
