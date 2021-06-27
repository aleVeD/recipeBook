package com.escalab.recipebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RecipeBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeBookApplication.class, args);
    }

}
