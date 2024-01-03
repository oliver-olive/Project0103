package org.example;

public class Main {
    public static void main(String[] args) {

        MenuRecommendation m = new MenuRecommendation();
        System.out.println(m.getRecommendedItem());
        m.addItem(1, "item1");
        m.rateItem(1, 5);
        System.out.println(m.getRecommendedItem());
        m.outOfStockItem(1);
        m.rateItem(1,4);
        m.rateItem(1, 4);
        System.out.println(m.getRecommendedItem());
        m.addItem(2, "item2");
        m.rateItem(2, 5);
        m.makeDealOfTheDayItem(2);
        System.out.println(m.getRecommendedItem());
        m.outOfStockItem(2);
        System.out.println(m.getRecommendedItem());
        m.rateItem(2,0);
        m.restockItem(1);
        m.restockItem(2);
        System.out.println("test " + m.menuItem.get(1));
        System.out.println("test1 " + m.menuItem.get(2));
        System.out.println(m.getRecommendedItem());
        m.rateItem(2, 100);
        System.out.println(m.getRecommendedItem());
    }
}