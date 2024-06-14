package org.example.decoratorpattern;

public abstract class Decorator extends Beverage {
    protected Beverage beverage;

    @Override
    public int getCost() {

        return this.cost + beverage.getCost();
    }

    @Override
    public String getDescription() {

        return this.description + beverage.getDescription();
    }

}
