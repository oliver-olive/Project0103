package org.example;

public class Main {
    public static void main(String[] args) {

        Bread b = new Bread(4.0,1.1,13.8);
        b.getType();
        b.getMarcoNutrients();
        b.getTaste();
        Food f1 = new Egg(6.3,5.3,0.6);
        Egg e1 = (Egg) f1;
        e1.getMarcoNutrients();
        e1.getTaste();
        e1.getType();
    }
}