//Name:		Will Wetzel - 130251255
//Program:		Project two - PizzaBuild
//Module:		CSC1021 - Programming I
//Description:	A pizza build program that will build a predefined pizza to demonstrate
//				the Pizza, PizzaTopping and PizzaBase classes.

public class PizzaBuild 
{

	public static void main(String[] args) 						//Main method.
	{
		Pizza pizza = new Pizza();						//New pizza object.
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));		//Creates and adds base object to the pizza object.
		pizza.addTopping(new PizzaTopping("Tomato Sauce", 0.50, false));	//Creates and adds topping object to the pizza object.		
		pizza.addTopping(new PizzaTopping("Cheese", 0.50, false));		//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Ham", 1.25, true));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Pineapple", 1.25, false));		//Creates and adds topping object to the pizza object.
		pizza.total();								//Calls the total method for the pizza object.
	}

}
