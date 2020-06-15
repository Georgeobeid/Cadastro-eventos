package com.example.Service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {
    @GetMapping("/rest")
    public String sayRest(){
    return "Great, lest's take a rest with a Spring boot";

    }
}
