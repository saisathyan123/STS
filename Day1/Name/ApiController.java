package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/")
    public String getName() {
        String Name="Sai sathyan";
        return "My Name is"+Name;
    }
}