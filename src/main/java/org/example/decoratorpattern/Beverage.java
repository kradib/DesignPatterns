package org.example.decoratorpattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {

    protected int cost;
    protected String description;

    public int getCost() {
        return this.cost;
    }

    public String getDescription() {
        return this.description;
    }
}
