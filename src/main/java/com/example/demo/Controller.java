package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller {
    @GetMapping("/home")
    public String getHome()
    {
        return "Home";
    }
    @GetMapping("/about")
    public String getAbout()
    {
        return "About";
    }
}
