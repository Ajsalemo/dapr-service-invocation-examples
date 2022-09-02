package com.dapr.http.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "service-invocation-java-http-frontend";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
