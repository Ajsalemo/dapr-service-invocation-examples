package com.dapr.sdk.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import io.dapr.client.domain.HttpExtension;

@RestController
public class ApiController {
    String DAPR_BACKEND_SERVICE = "backend";
    String DAPR_BACKEND_METHOD = "api/cars/get";

    @GetMapping("/api/dapr")
    public Void apiController() throws Exception {
        try (DaprClient client = (new DaprClientBuilder()).build()) {
            Void apiResponse = client
                    .invokeMethod(DAPR_BACKEND_SERVICE, DAPR_BACKEND_METHOD, byte[].class, HttpExtension.GET).block();

            System.out.println(apiResponse);
            return apiResponse;
        }
    }
}
