package com.CMS.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrosConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/addPatient")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("*");

        registry.addMapping("/viewPatients")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("*");
        
        registry.addMapping("/deletePatient/{patient_id}")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/searchByPatientId/{patient_id}")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/updatePatient")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/addAppoint")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/listAppoint")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/addDiet")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/listDiet")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/addPrep")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
        registry.addMapping("/listPrep")
        .allowedOrigins("http://localhost:4200")
        .allowedMethods("*");
        
    }
}
