package org.example.decoratorpattern;

public class ChocolateDecorator extends Decorator {

    public ChocolateDecorator(final int cost, final String description, final  Beverage beverage) {
        this.cost = cost;
        this.description = description;
        this.beverage = beverage;
    }


    @Override
    public int getCost() {

        return this.cost + beverage.getCost();
    }

    @Override
    public String getDescription() {

        return this.description + " " + beverage.getDescription();
    }


}
