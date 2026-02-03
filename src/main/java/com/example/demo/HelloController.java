package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HelloRequest;
import com.example.demo.dto.HelloResponse;

@RestController
public class HelloController {

    @GetMapping("/")
    public HelloResponse hello() {
        return new HelloResponse(
                "Hello from Spring Boot API!",
                "SUCCESS"
        );
    }

    @PostMapping("/")
    public HelloResponse helloPost(@RequestBody HelloRequest request) {
        return new HelloResponse(
                "Hello " + request.getName() + " from Spring Boot API!",
                "SUCCESS"
        );
    }
}
