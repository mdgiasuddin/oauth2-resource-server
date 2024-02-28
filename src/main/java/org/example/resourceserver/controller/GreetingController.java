package org.example.resourceserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/user")
    public String greetUser() {
        return "Hello User! Welcome to Oauth2!";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
    public String greetAdmin() {
        return "Hello Admin! Welcome to Oauth2!";
    }
}