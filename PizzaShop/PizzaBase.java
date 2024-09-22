//Name:		Will Wetzel - 130251255
//Program:		Project two - PizzaBase
//Module:		CSC1021 - Programming I
//Description:	This class models a pizza base and topping.

public class PizzaBase 
{
	private String Name;				//Declare cost name.
	private double Cost;				//Declare base cost.
	private boolean vegetarian;			//Declare vegetarian boolean.
							//No main method
	public PizzaBase()				//Constructor for pizza base.
	{
		setName(Name);				//Sets object's name using a setter method.
		setCost(Cost);				//Sets object's cost using a setter method.
		setVeg(vegetarian);			//Sets object's boolean for vegetarian using a setter method.
	}
	
	public String getName()				//Base name getter method.
	{
		return Name;
	}
	
	public void setName(String Name)		//Base name setter method.
	{
		this.Name = Name;			//Base name in this method = Base name throughout this class.
	}
	
	public double getCost()				//Base cost getter method.
	{
		return Cost;				//Base cost in this method = Base cost throughout this class.
	}
	
	public void setCost(double Cost)		//Base cost setter method.
	{
		this.Cost = Cost;
	}
	
	public boolean getVeg()				//Vegetarian boolean getter method.
	{
		return vegetarian;	//Vegetarian boolean in this method = Vegetarian boolean throughout this class.
	}
	
	public void setVeg(boolean vegetarian)		//Vegetarian boolean setter method.
	{
		this.vegetarian = vegetarian;
	}
	
}
