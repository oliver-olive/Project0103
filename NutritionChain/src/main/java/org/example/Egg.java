package org.example;

public class Egg extends Food{
    String type = "non-vegetarian";
    int tastyScore = 7;
    public Egg(double proteins,double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }

    @Override
    void getMarcoNutrients() {
        System.out.println("An ege has " +  this.proteins + "gms of protein, " +  this.fats + "gms of fats and " + this.carbs +  "gms of carbohydrates.");
    }
    void getType(){
        System.out.println("Egg is " + type);
    }
    void getTaste(){
        System.out.println("Taste: " + tastyScore);
    }

}
