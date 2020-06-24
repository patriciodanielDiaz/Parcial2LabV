package com.utn.resttemplateSwagger.service.integration;

import com.utn.resttemplateSwagger.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8080/parcial/";

    @PostConstruct
    private void init() {
        rest = new RestTemplateBuilder()
                .build();
    }

    public User getUserFromApi() {

        /*HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        headers.set("Authorization", "05ac1735-b8e1-46b1-a1e7-9c2d6931f97c");
        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<User> response = rest.exchange(
                url,
                HttpMethod.GET,
                request,
                User.class,
                1
        );
        return response;*/

        return rest.getForObject(url , User.class);
    }

}