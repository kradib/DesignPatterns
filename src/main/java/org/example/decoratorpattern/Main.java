package org.example.decoratorpattern;



public class Main {

    public static void main(String[] args) {
       //Chocolate Caramel Chocolate Soya Espresso
        //Espresso -> 1
        //Cappuccino -> 2
        // Tea -> 1
        //Add ons:
        // Chocolate : 3
        //Soya : 1
        //Caramel : 2
        Espresso espresso = new Espresso(1, "Espresso");
        SoyaDecorator soyaEspresso = new SoyaDecorator(1, "soya", espresso);
        ChocolateDecorator chocoSoyaEspresso = new ChocolateDecorator(3, "Chocolate", soyaEspresso);
        CaramealDecorator caramelChocoSoyaEspresso = new CaramealDecorator(2, "Caramel", chocoSoyaEspresso);
        ChocolateDecorator chocoCaramelChocoSoyaEspresso = new ChocolateDecorator(3, "Chocolate", caramelChocoSoyaEspresso);

        System.out.println(chocoCaramelChocoSoyaEspresso.getDescription());
        System.out.println(chocoCaramelChocoSoyaEspresso.getCost());
    }
}
