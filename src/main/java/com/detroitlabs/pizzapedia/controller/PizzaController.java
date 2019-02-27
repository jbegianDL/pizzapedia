package com.detroitlabs.pizzapedia.controller;

import com.detroitlabs.pizzapedia.data.PizzaRepository;
import com.detroitlabs.pizzapedia.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;


    public String getAllPizza(ModelMap modelMap){
        List<Pizza> pizza = pizzaRepository.getAllPizza();
        modelMap.put("pizza", pizza);
        return "home";
    }

    @RequestMapping("/pizza/{name}")
    public String getDetails(@PathVariable String name, ModelMap modelMap){
        Pizza pizza = pizzaRepository.findPizzaByName(name);
        modelMap.put("pizza", pizza);
        return "pizza-details";
    }
}
