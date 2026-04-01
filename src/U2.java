import java.util.ArrayList;
import java.util.List;

/*
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 */

public class U2 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC2");
        System.out.println("=====================================");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        System.out.println("\nAdding Passenger Bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies
        System.out.println("\nCurrent Passenger Bogies:");
        System.out.println(passengerBogies);

        // Remove a bogie
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter Removal:");
        System.out.println(passengerBogies);

        // Check existence
        System.out.println("\nChecking if 'Sleeper' exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}