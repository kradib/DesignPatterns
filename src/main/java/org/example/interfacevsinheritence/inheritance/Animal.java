package org.example.interfacevsinheritence.inheritance;

public class Animal {

    String name;
    String color;

    public Animal(final String name, final String colour) {
        this.color = colour;
        this.name = name;
    }

    public void printDescription() {
        System.out.println("I am an animal");
    }


}
