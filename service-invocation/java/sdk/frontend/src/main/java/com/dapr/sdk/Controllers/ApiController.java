package com.dapr.sdk.Controllers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import io.dapr.client.domain.HttpExtension;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {
    String DAPR_BACKEND_SERVICE = "backend";
    String DAPR_BACKEND_METHOD = "api/get/cars";

    @GetMapping("/api/dapr")
    public Mono<List> apiController() throws Exception {
        try (DaprClient client = (new DaprClientBuilder()).build()) {
            Mono<List> apiResponse = client
                    .invokeMethod(DAPR_BACKEND_SERVICE, DAPR_BACKEND_METHOD, null, HttpExtension.GET, List.class);

            System.out.println(apiResponse);
            return apiResponse;
        }
    }
}
