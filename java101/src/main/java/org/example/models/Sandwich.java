package org.example.models ;

import java.util.ArrayList;

public class Sandwich {
    private Bread upperBread;
    private Bread lowerBread;

    private ArrayList<Ingredient> ingredients;

    public Sandwich() {
        // this.ingredients = new ArrayList<Ingredient>();

        ingredients = new ArrayList<Ingredient>();
    }

    public Sandwich(String kuy) {
        // this.ingredients = new ArrayList<Ingredient>();

        ingredients = new ArrayList<Ingredient>();
    }

    public void CreatingSandwhich(String upperBreadName, String lowerBreadName, String ingredientName) {
        this.upperBread = new Bread(upperBreadName);
        this.lowerBread = new Bread(lowerBreadName);
        AddIngredient(ingredientName, -1);
    }

    public void CreatingSandwhich(String upperBreadName, String lowerBreadName, String ingredientName,int ingredientCalories) {
        this.upperBread = new Bread(upperBreadName);
        this.lowerBread = new Bread(lowerBreadName);
        AddIngredient(ingredientName, ingredientCalories);
    }

    private void AddIngredient(String ingredientName, int ingredientCalories) {
        this.ingredients.add(new Ingredient(ingredientName, ingredientCalories));
    }

    public void LogsSandwich() {
        System.out.println("Upper Bread: " + this.upperBread.name);
        System.out.println("Lower Bread: " + this.lowerBread.name);
        System.out.println("ingredients:");
        for (Ingredient ingredient : this.ingredients) {
            System.out.println(" - " + ingredient.name + ": " + ingredient.calories + " calories");
        }
    }
}
