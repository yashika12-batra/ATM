package ATMachine;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	 static Scanner scanner = new Scanner(System.in);
	 static float bal;
	 
    public static void displayMenu() {
        System.out.println(DisplayMessages.menuOptions_msg);
    }
    
    

    public static int getUserChoice() {
       

        try {
            System.out.println("Enter your choice:");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); 
            return getUserChoice(); 
        }
    }

    public static void processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Balance: " + bal);
                break;
                
            case 2:
                System.out.println("Enter the amount to be withdrawn...");
                float amount=scanner.nextFloat();
        		if (amount>bal) {
        			System.out.println("Insufficient Balance");
        		}
        		else {
        			bal=bal-amount;
        			System.out.println("Money Withdrawn Successfully");
        		}
                break;
                
            case 3:
            	System.out.println("Enter the amount.. ");
        		float amount2=scanner.nextFloat();
        		bal=bal+amount2;
        		System.out.println("Money Deposited Successfully");
                break;
            case 4:
                System.out.println(DisplayMessages.exit_msg);
                System.exit(0);
                break;
            default:
                System.out.println(DisplayMessages.invalidOption_msg);
        }
    }
}