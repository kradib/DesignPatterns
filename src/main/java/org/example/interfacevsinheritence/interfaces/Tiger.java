package org.example.interfacevsinheritence.interfaces;


import org.example.interfacevsinheritence.interfaces.Animal;

/*
  If i only need to sort code duplication I don't need inheritance

 */
public class Tiger implements Animal {

    private String color;

    private String name;



    public Tiger() {
        this.color = "Yellow";
        this.name = "Tiger";
    }

    public void printDescription() {

    }

    @Override
    public void printDescription(String name, String color) {

    }
}
