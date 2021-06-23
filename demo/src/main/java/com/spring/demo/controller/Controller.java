package com.spring.demo.controller;

import com.spring.demo.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Services services;

    @GetMapping("/fetch")
    public String retrive() {

         return services.fetch();

    }

    @GetMapping("/insert")
    public String insert() {

        return services.insert();

    }
}
