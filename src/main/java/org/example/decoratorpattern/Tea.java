package org.example.decoratorpattern;

public class Tea extends Beverage {

    public Tea(final int cost, final String description) {
        this.cost = cost;
        this.description = description;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    public String getDescription() {
        return this.description;
    }
}
