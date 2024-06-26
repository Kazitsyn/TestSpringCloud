package com.example.task_1_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Task11Application {

    public static void main(String[] args) {
        SpringApplication.run(Task11Application.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("Microservice1",r->r.path("/testJPA/**")
                        .uri("http://127.0.0.1:8075/"))
                .route("Microservice2",r->r.path("/testJWT/**")
                        .uri("http://127.0.0.1:8082/")).build();}
}
