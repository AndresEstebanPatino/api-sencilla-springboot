package com.crudapispringbootpostgresjpa.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/api/v1/libros") // Ruta de la API que deseas permitir
                .allowedOrigins("http://localhost:5173") // Corrige la URL del origen permitido
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos HTTP permitidos
                .allowCredentials(true) // Permitir cookies y encabezados personalizados
                .maxAge(3600); // Duración en segundos para mantener la configuración de CORS en caché en el navegador
    }
}
