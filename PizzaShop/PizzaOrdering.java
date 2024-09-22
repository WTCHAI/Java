import java.util.ArrayList;
import java.util.Scanner;
import java.util.Dictionary;


// [
//     {
//         [order1,order2 ]
//     }
// ]
// order1 = [{name : 'name1' ,price : 200 },{name2 : "sing", price : 201}]

public class PizzaOrdering {
    // This order require atleast 1 pizza created for case we wanted to order more
    // than 1 pizza
    private static String pIn = "" ;  
    private static Scanner keyboard = new Scanner(System.in);			//Initialize scanner for user input.
    
    private static ArrayList<Pizza> OrderList = new ArrayList<Pizza>();
    public static double totalPrice = 0  ;

    public static void main(String[] args) 						//Main method.
    {
        orderingPizza() ; 
    }


    public static void orderingPizza() {
        boolean isOrdering  = true ; 
        String newLine = System.getProperty("line.separator");			
		System.out.print("\t---------------------------------" + newLine);	
		System.out.print("Order pizaa nowww!!!!!" + newLine);	
        while (isOrdering) {

            Pizza pizza = new Pizza();			//New pizza object.
            try						
            {
                PizzaMenu.menu(pizza);
                PizzaMenu.menuSelect(pizza);
            }
            catch(IllegalArgumentException iae)			//Catches error thrown by the menu selection method.
            {
                    System.out.println("Invalid selection, please select again");		//Shows user error method.
                    PizzaMenu.menuSelect(pizza);							//Continues menu selection method.
            }
            
            pizza.total();	
            OrderList.add(pizza) ; 

            System.out.println("Do u still wanted to order!!! No press n");	//System out message for user.
            pIn = keyboard.nextLine();								//Uses user input as pIn.
    
            if("n".equalsIgnoreCase(pIn))									//If statement for if the input is not valid.
            {
                isOrdering = false ;
                // throw new IllegalArgumentException("\nMust enter a number between 1 and 5.\nPlease run again.");	//Throws exception.
            }
        }
        summarizeOrder();
    }

    public static void summarizeOrder() {
        String newLine = System.getProperty("line.separator");
        System.out.print("\t---------------------------------" + newLine); // Print top border
        for (Pizza pizza : OrderList) {
            double pizzaPrice = pizza.pizzaCost(); // Get the price of each pizza
            totalPrice += pizzaPrice; // Accumulate total price
        }
        System.out.println("Your total order cost is: " + totalPrice); // Print the total price
    }

    public static ArrayList<Pizza> getOrderList() {
        return OrderList ; 
    }
    public static double getTotalPrice (){
        return totalPrice ; 
    }
}

