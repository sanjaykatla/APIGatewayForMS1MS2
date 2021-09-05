package com.sanjay.apigateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApiGateWayConfig {

  @Bean
  public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){

    /**
     *
     */
    return builder.routes().route(r -> r.path("/ms1/v1/**")
        .uri("lb://MICROSERVICE1").id("microservice1"))

        .route(r -> r.path("/ms2/v1/**")
            .uri("lb://MICROSERVICE2")
            .id("microservice2"))
        .build();



  }
}
