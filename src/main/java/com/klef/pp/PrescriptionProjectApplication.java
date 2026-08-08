package com.klef.pp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrescriptionProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(PrescriptionProjectApplication.class, args);

        System.out.println("======================================");
        System.out.println("Prescription Project is running successfully!");
       // System.out.println("Server started at: http://localhost:8080");
       // System.out.println("Swagger UI: http://localhost:8080/swagger-ui/index.html");
        System.out.println("======================================");
    }
}