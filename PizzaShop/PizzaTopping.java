//Name:		Will Wetzel - 130251255
//Program:		Project two - PizzaTopping
//Module:		CSC1021 - Programming I
//Description:	This class extends PizzaBase and builds the base and toppings.

public class PizzaTopping extends PizzaBase
{
										//No main method
	
	public PizzaTopping(String Name, double Cost, boolean vegetarian)	//Pizza topping constructor.
	{
		setName(Name);			//Sets the object's name using a set method.
		setCost(Cost);			//Sets the object's cost using a set method.
		setVeg(vegetarian);		//Sets object's boolean for vegetarian using a setter method.
	}
}
