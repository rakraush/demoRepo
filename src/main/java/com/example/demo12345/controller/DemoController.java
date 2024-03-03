package com.example.demo12345.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/name")
    public String name(){

        return "Krishna naam and Ram naam and Radha naam hai";

    }
}
