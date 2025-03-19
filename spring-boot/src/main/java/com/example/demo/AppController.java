package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${MY_ACCOUNT:default}")
    private String myAccount;

    @Value("${MY_PASSWORD:default}")
    private String myPassword;

    @GetMapping("/")
    public String home() {
        return "Version 1.1";
    }

    @GetMapping("/value")
    public String home2() {
        return "myAccount: " + myAccount + ", myPassword: " + myPassword;
    }
}
