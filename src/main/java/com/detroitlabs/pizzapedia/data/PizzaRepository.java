package com.detroitlabs.pizzapedia.data;

import com.detroitlabs.pizzapedia.model.Pizza;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PizzaRepository {

    private static final List<Pizza> ALL_PIZZA = Arrays.asList(
            new Pizza("cheese", "A classic pizza with just cheese only\n" +
                    "They come in Square or round "),
            new Pizza("deadpool", "This is DeadPools favorite pizza\n" +
                    " It comes with only Cheese, Pineapple and Olives"),
            new Pizza("hawaiian", "Greek-Canadian Sam Panopoulos claimed that he " +
                    "created the first Hawaiian pizza at the Satellite Restaurant in" +
                    " Chatham, Ontario, Canada in 1962 \n it traditional comes with, Cheese, Ham, Bacon and Pineapple"),
            new Pizza("margarita", "A Margarita normally comes with, Cheese, Tomato and Basil Leaves"),
            new Pizza("pepperoni", "This Pizza comes simply with Cheese and Pepperoni"),
            new Pizza("veggie", "This Pizza can come with many a variety of veggies depending" +
                    "on where you are eating."));

    public Pizza findPizzaByName(@PathVariable String name) {
        for (Pizza pizza : ALL_PIZZA) {
            if (pizza.getPizzaName().equals(name)) {
                return pizza;
            }
        }
        return null;
    }
    public List<Pizza> getAllPizza() {
        return ALL_PIZZA;
    }



}


