package ATMachine;

public class ATMmachine {
	
    public static void main(String[] args) {
        System.out.println(DisplayMessages.welcome_msg);

        try {
            
            if (CheckPin.verifyPin()) {
                while (true) {
                    Menu.displayMenu();
                    int choice = Menu.getUserChoice();
                    Menu.processChoice(choice);
                }
            } else {
                System.out.println(DisplayMessages.invalidPin_msg);
                
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred. Please try again.");
        }
    }
}

