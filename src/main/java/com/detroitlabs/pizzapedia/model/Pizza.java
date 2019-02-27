package com.detroitlabs.pizzapedia.model;


public class Pizza {
    String pizzaName;
    String pizzaDescription;

    public Pizza(String pizzaName, String pizzaDescription) {
        this.pizzaName = pizzaName;
        this.pizzaDescription = pizzaDescription;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaDescription() {
        return pizzaDescription;
    }

    public void setPizzaDescription(String pizzaDescription) {
        this.pizzaDescription = pizzaDescription;
    }


}
