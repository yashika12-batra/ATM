package ATMachine;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckPin {
	
    private static final List<String> valid_pins = Arrays.asList("1234","5678","9876");
    

    public static boolean verifyPin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(DisplayMessages.enterPin_msg);

        try {
            String enteredPin = scanner.nextLine();
            return valid_pins.contains(enteredPin);
        } catch (Exception e) {
            System.out.println("An error occurred while reading the PIN. Please try again.");
            return false;
        }
    }
}
