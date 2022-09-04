package com.dapr.http.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {
    @GetMapping("/api/dapr")
    public String apiController() {
        final String uri = "http://localhost:3500/v1.0/invoke/backend/method/api/get/cars";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);

        return result;
    }

}
