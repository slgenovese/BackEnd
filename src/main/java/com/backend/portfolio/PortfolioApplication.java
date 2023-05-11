package com.backend.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}
// Esta parte habilita la comunicacion entre el cliente y el servidor de forma global
//Tambien se puede habilitar a nivel de metodo con @CrossOrigin(origins = "http://localhost:4200")
//al comienzo de cada metodo.
    @Bean
    public WebMvcConfigurer corsConfigurer()
    {
       String[] allowDomains = new String[3];
       String[] allowMethods = new String[7]; 
       allowDomains[0] = "http://localhost:4200";
       allowDomains[1] = "http://localhost:8080";
       allowDomains[2] = "*";

       allowMethods[0] = "GET";
       allowMethods[1] = "POST";
       allowMethods[2] = "PATCH";
       allowMethods[3] = "PUT";
       allowMethods[4] = "DELETE";
       allowMethods[5] = "OPTIONS";
       allowMethods[6] = "HEAD";

       System.out.println("CORS configuration....Dale!!!!");
       return new WebMvcConfigurer() {
          @Override
          public void addCorsMappings(CorsRegistry registry) {
             registry.addMapping("/**")
                     .allowedOrigins(allowDomains)
                     .allowedMethods( allowMethods);
          }
       };
    }
}
