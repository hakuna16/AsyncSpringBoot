package com.test.async.configurations;

import javax.validation.constraints.NotNull;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;


@Configuration
@AllArgsConstructor
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        
        return new RestTemplate();
    }
}
