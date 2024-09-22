import java.util.Scanner;
import java.util.Dictionary;

public class PizzaPos {
    private static Scanner keyboard = new Scanner(System.in); // Initialize scanner for user input
    // private static  OrderLogsTransaction ; 

    // log 1 order pizza1 , price 

    public static void main(String[] args) {
        welcomeInterface(); // Call the welcome interface

    }

    // Method to display the welcome interface
    public static void welcomeInterface() {
        String newLine = System.getProperty("line.separator");

        // Welcome message
        System.out.println("\t=======================================");
        System.out.println("\t  WELCOME TO THE PIZZA SHOP!");
        System.out.println("\t=======================================");
        System.out.println("\t     Best Pizza in Town, Fresh & Hot!");
        System.out.println("\t---------------------------------------");
        System.out.println("\t       Please Follow The Steps Below");
        System.out.println("\t---------------------------------------");
        System.out.println("\t 1. Start your order");
        System.out.println("\t 2. Exit");
        System.out.println("\t=======================================");

        // Prompt user to choose an option
        int option = 0  ;
        while (option!=2) {
            // Prompt user to choose an option
            System.out.print("\tPlease select an option (1 or 2): ");
            option = keyboard.nextInt();
                    
            if  (option == 1 ){
                System.out.println(newLine + "\tLet's start your pizza order!");
                // Call your pizza ordering process here
                PizzaOrdering.orderingPizza();
                System.out.println("\t 1. Start your order");
                System.out.println("\t 2. Exit");
                System.out.println("\t=======================================");
            }
            else {
                System.out.println(newLine + "\tThank you for visiting! See you next time.");
                break;
            }
        }
    }

}