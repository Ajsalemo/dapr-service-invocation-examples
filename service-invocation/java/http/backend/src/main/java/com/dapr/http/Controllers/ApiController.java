package com.dapr.http.Controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api/get/cars")
    public List<String> apiController() {
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("BMW", "Audi", "Porsche", "RUF"));
        return list;
    }
}
