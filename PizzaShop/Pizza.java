//Name:		Will Wetzel - 130251255
//Program:		Project two - Pizza
//Module:		CSC1021 - Programming I
//Description:	This class models a pizza and has calculations for finding its costs and total costs.

import java.util.ArrayList;

public class Pizza
{																				
	private ArrayList<PizzaTopping> tops = new ArrayList<PizzaTopping>();		//Initializing Array list for storing PizzaToppings.
	private PizzaBase base;								//Initializing the base using parameters declared in the PizzaBase class constructor..
	private int bInput;								//Initializing selection variable for PizzaChoice method.
	private int tInput;								//Initializing selection variable for PizzaChoice method.
	private int pIn;								//Initializing selection variable for PizzaMenu method.
	private String name ;

	public Pizza()									//Initializing Constructor for the pizza object.
	{										//There is no main method in this class.
		this.setPizzaBase(base);						//Calls set method for base.
		this.tops = new ArrayList<PizzaTopping>();				//toppings in this method = t throughout this class.
	}

	public void setPizzaBase(PizzaBase base)					//Set method for pizza base.
	{
		this.base = base;							//base in this method = base used throughout this class.
	}

	public void addTopping(PizzaTopping topping)					//Method for adding toping to the pizza topping list.
	{
		tops.add(topping);
	}
	
	public double pizzaCost()							//Method for finding the cost of the pizza.
	{
		double cost = base.getCost();						//Declares cost and calls get cost method for the pizza base.
		for(PizzaTopping topping : tops)					//For loop for each element in the pizza toping array list.
		{
			cost += topping.getCost();					//Toping cost getter that adds onto the cost variable.
		}
		return cost;								//returns the cost of the pizza.
	}
	
	public void total()								//Method for order summary.
	{

		boolean Tveg = false;
		
		String newLine = System.getProperty("line.separator");			//Initialize "newLine" to enter a newline when entered in a system.out statement.
		System.out.print("\t---------------------------------" + newLine);	//Prints top border.
		System.out.format("\t%15s%21s", "-Ingredients-",  "-Price- "+ newLine);		//Prints header for the table.
		System.out.print("\t---------------------------------" + newLine);	//Prints border.
		System.out.printf("\t%-15s:%15s", base.getName(), base.getCost());	//Print the pizza Base.
		for(PizzaTopping topping : tops)					//for loop for every pizza topping.
		{
			System.out.printf(newLine + "\t%-15s:%15s", topping.getName(), topping.getCost());	//Prints every pizza topping and its price.
			if(topping.getVeg() == true)					//If topping is vegetarian set Tveg to true for if loop later.
			{
				Tveg = true;
			}
		}

		if(base.getVeg() == true || Tveg == true)				//If base or any topping is not vegetarian, print statement.
		{
			System.out.println("\n\n\tNot suitable for vegetarians");
		}
		else if(base.getVeg() == false && Tveg == false)			//If both base and all toppings are false, print statement.
		{
			System.out.println("\n\n\tSuitable for vegetarians");
		}
		
		System.out.printf(newLine + "\t%-15s:%15s","Total Cost", pizzaCost());		//displays total pizza dcost.
		System.out.print(newLine + "\t---------------------------------" + newLine);	//Prints border.
	}
	
	//******************************Get and set methods for other pizzaChoice and pizzaMenu class selections******************************//

    public int getbInput()							//Get base input method for the PizzaChoice class.
    {
    	return bInput;
    }	
	public void setbInput(int bInput)					//Set base input method for the pizzaChoice class.
    {	
    	this.bInput = bInput;      	
    }
    
    public int gettInput()							//Get topping input method for the pizzaChoice class.
    {
    	return tInput;
    }	
	public void settInput(int tInput)					//Get topping input method for the pizzaChoice class.
    {	
    	this.tInput = tInput;      	
    }
	
    public int getpIn()														
    {
    	return pIn;
    }	
	public void setpIn(int pIn)												
    {	
    	this.pIn = pIn;      	
    }

	public String getPizzaName(){
		return this.name ; 
	}

	public void setPizzaName(String new_name){
		this.name = new_name  ; 
	}
}