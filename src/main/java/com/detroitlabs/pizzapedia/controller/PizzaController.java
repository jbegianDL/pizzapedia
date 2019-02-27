package com.detroitlabs.pizzapedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PizzaController {

    @Autowired
    PizzaController pizzaController;

    @RequestMapping("/")
    public String displayHome(){
        String hello = "Hello";
        return hello;
    }
}
