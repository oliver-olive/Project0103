package org.example;

public class Bread extends  Food{
    String type = "vegetarian";
    int tastyScore = 8;
    public Bread(double proteins,double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }

    @Override
    void getMarcoNutrients() {
        System.out.println("An ege has " +  this.proteins + "gms of protein, " +  this.fats + "gms of fats and " + this.carbs +  "gms of carbohydrates.");
    }
    void getType(){
        System.out.println( "Bread is " + type);
    }
    void getTaste(){
        System.out.println( "Taste: " + tastyScore);
    }
}
