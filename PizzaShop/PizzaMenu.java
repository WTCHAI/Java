//Name:		Will Wetzel - 130251255
//Program:		Project two - PizzaChoice
//Module:		CSC1021 - Programming I
//Description:	A class that will show the user a menu of bases and toppings modeled on previous classes
//				and takes the user selection. It will then build a pizza modeled according to the pizza class
//				and call the method "pizza.total" to show a summary and the total cost of the pizza.

import java.util.Scanner;

public class PizzaMenu
{
	private static int pIn;					//Initialize variable for pizza selection.
	private static Scanner keyboard;			//Initialize scanner for user input.
	public static void main(String[] args) 			//Main method
	{
		Pizza pizza = new Pizza();			//New pizza object.
		menu(pizza);					//Calls menu method.
		try						//Try menu selection method (user input)
		{
			// 
			menuSelect(pizza);
		}
        catch(IllegalArgumentException iae)			//Catches error thrown by the menu selection method.
		{
        		System.out.println("Invalid selection, please select again");		//Shows user error method.
        		menuSelect(pizza);							//Continues menu selection method.
		}
		pizza.total();					//Pizza summary method.
	}
	
	public static void menu(Pizza pizza)			//Method for printing table of pizzas.
	{
		keyboard = new Scanner(System.in);		//Declaring keyboard as scanner, else null pointer exception will occur.
		
		System.out.println("Pizza selection");
		String newLine = System.getProperty("line.separator");					//Initialize "newLine" to enter a newline when entered in a system.out statement.
		System.out.print("\t-----------------------------------------" + newLine);		//Prints top border.
		System.out.format("\t%15s%25s", "-Pizzas-",  "-Description- "+ newLine);		//Prints header for the table.
		System.out.print("\t-----------------------------------------" + newLine);		//Prints border.
		
		System.out.format("\t%-5s%1s\t\t%10s", "1.", "Margherita", "Cheese and tomato" + newLine);		//Prints strings that contain pizza name and a brief...
		System.out.format("\t%-5s%1s\t\t%10s", "2.", "Hawaiian", "Ham and pineapple" + newLine);			//... description.
		System.out.format("\t%-5s%1s\t\t%10s", "3.", "Americano", "Chicken, pepperoni and onions" + newLine);
		System.out.format("\t%-5s%1s\t\t%10s", "4.", "TexasBBQ", "Chicken, peppers and Bacon" + newLine);
		System.out.format("\t%-5s%1s\t\t%10s", "5.", "Veggie", "Peppers, mushrooms, onions and sweetcorn" + newLine);
	
		System.out.print(newLine + "\t-----------------------------------------" + newLine);	//Prints border.
	}
	
	public static void menuSelect(Pizza pizza)
	{
		System.out.println("Please enter your pizza by entering its respective number.");	//System out message for user.
		pIn = keyboard.nextInt();								//Uses user input as pIn.

		if(pIn<1||pIn>5)									//If statement for if the input is not valid.
		{
			throw new IllegalArgumentException("\nMust enter a number between 1 and 5.\nPlease run again.");	//Throws exception.
		}
		else if(pIn == 1)									//Else if loop for setting the pizza base.
		{
			pizza.setPizzaName("Margherita") ; 
			margherita(pizza);								//Calls margherita method that builds the pizza.
			System.out.println("You've selected 'Margherita'.\n");				//Confirmation message for user.
		}
		else if(pIn == 2)
		{
			pizza.setPizzaName("Hawaiian") ; 
			hawaiian(pizza);								//Calls hawaiian method that builds the pizza.																					
			System.out.println("You've selected 'Hawaiian'.\n");				//Confirmation message for user.
		}
		else if(pIn == 3)
		{
			pizza.setPizzaName("Americano") ; 
			americano(pizza);								//Calls americano method that builds the pizza.
			System.out.println("You've selected 'Americano'.\n");				//Confirmation message for user.
		}
		else if(pIn == 4)
		{
			pizza.setPizzaName("TexasBBQ") ; 
			texasBBQ(pizza);								//Calls texasBBQ method that builds the pizza.
			System.out.println("You've selected 'TexasBBQ'.\n");				//Confirmation message for user.
		}
		else if(pIn == 5)
		{
			pizza.setPizzaName("Veggie") ; 
			veggie(pizza);																//Calls veggie method that builds the pizza.
			System.out.println("You've selected 'Veggie'.\n");				//Confirmation message for user.
		}
		pizza.setpIn(pIn);
	}
	
	
	//******************************Predefined pizza methods for the menu******************************//
	
	public static void margherita(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));			//Creates and adds base object to the pizza object.
		pizza.addTopping(new PizzaTopping("Tomato Sauce",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			//Creates and adds topping object to the pizza object.	
	}
	
	public static void hawaiian(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));			//Creates and adds base object to the pizza object.
		pizza.addTopping(new PizzaTopping("Tomato Sauce",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Ham",1.25, true));				//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Pineapple",1.25, false));			//Creates and adds topping object to the pizza object.
	}	
	
	public static void americano(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("Stuffed crust", 4.50, false));		//Creates and adds base object to the pizza object.
		pizza.addTopping(new PizzaTopping("BBQ Sauce",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Chicken",1.75, true));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Pepperoni",1.50, true));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Onion",0.75, false));			//Creates and adds topping object to the pizza object.
		
	}
	
	public static void texasBBQ(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thick", 3.00, false));			//Creates and adds base object to the pizza object.
		pizza.addTopping(new PizzaTopping("BBQ Sauce",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Chicken",1.75, true));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Peppers",1.00, false));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Bacon",2.00, true));				//Creates and adds topping object to the pizza object.
	}
	
	public static void veggie(Pizza pizza)
	{
		pizza.setPizzaBase(new PizzaTopping("thin", 2.50, false));			//Creates and adds base object to the pizza object.
		pizza.addTopping(new PizzaTopping("Tomato Sauce",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Cheese",0.50, false));			//Creates and adds topping object to the pizza object.	
		pizza.addTopping(new PizzaTopping("Peppers",1.00, false));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Mushrooms",0.75, false));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Onions",0.75, false));			//Creates and adds topping object to the pizza object.
		pizza.addTopping(new PizzaTopping("Sweetcorn",0.50, false));			//Creates and adds topping object to the pizza object.
	}
	

}
