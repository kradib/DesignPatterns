package org.example.interfacevsinheritence.inheritance;

public class Tiger extends Animal {

    public Tiger(final String name, final String colour) {
        super(name, colour);
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("I have colour " + this.color);
        System.out.println("I am tiger");

    }

}
