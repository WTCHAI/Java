import java.util.ArrayList;

public class Sandwich {
    private Bread upperBread  ;
    private Bread lowerBread  ;

    private ArrayList <Ingredient>  Ingredients ; 

    public Sandwich(){
        // this.Ingredients = new ArrayList<Ingredient>();
    }

    public void CreatingSandwhich(String upperBreadName, String lowerBreadName, String ingredientName , int ingredientCalories){
        this.upperBread = new Bread(upperBreadName) ;
        this.lowerBread = new Bread(lowerBreadName) ;
        AddIngredient(ingredientName, ingredientCalories);
    }

    private void AddIngredient(String ingredientName , int ingredientCalories){
        this.Ingredients.add(new Ingredient(ingredientName, ingredientCalories));
    }

    public void LogsSandwich(){
        System.out.println("Upper Bread: " + this.upperBread.name);
        System.out.println("Lower Bread: " + this.lowerBread.name);
        System.out.println("Ingredients:");
        for (Ingredient ingredient : this.Ingredients) {
            System.out.println(" - " + ingredient.name + ": " + ingredient.calories + " calories");
        }
    }
}
