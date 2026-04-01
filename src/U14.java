/*
 * UC14: Handle Invalid Bogie Capacity (Custom Exception)
 */

// Custom exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class with validation
class PassengerBogie {

    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class U14 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC14");
        System.out.println("=====================================");

        try {
            // Valid bogie
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("\nCreated: " + sleeper);

            // Invalid bogie (zero capacity)
            PassengerBogie invalid1 = new PassengerBogie("AC Chair", 0);
            System.out.println("Created: " + invalid1);

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        try {
            // Invalid bogie (negative capacity)
            PassengerBogie invalid2 = new PassengerBogie("First Class", -10);
            System.out.println("Created: " + invalid2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues...");
    }
}