package com.detroitlabs.pizzapedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PizzaController {

    @RequestMapping("/")
    @ResponseBody
    public String displayHome(){
        String hello = "Hello world";
        return hello;
    }
}
