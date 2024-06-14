package org.example.decoratorpattern;

public class Cappuccino extends Beverage {

    public Cappuccino(final int cost, final String description) {
        this.cost = cost;
        this.description = description;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
