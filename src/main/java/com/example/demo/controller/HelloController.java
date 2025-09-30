package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        ZonedDateTime koreaTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        Map<String, Object> response = new HashMap<>();
        response.put("koreaTime", koreaTime.toString());
        response.put("timestamp", koreaTime.toInstant().toEpochMilli());
        response.put("message", "Hello, World!");
        return response;
    }
}