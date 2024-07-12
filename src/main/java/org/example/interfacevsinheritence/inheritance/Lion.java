package org.example.interfacevsinheritence.inheritance;

import java.util.List;

public class Lion extends Animal {

    public Lion(final String name, final String colour) {
        super(name, colour);
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("I have colour " + this.color);
        System.out.println("I am Lion");
    }


}
