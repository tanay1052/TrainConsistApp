import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * UC7: Sort Bogies by Capacity (Comparator)
 */

// Bogie class (custom object)
class Bogie {

    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
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

public class U7 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC7");
        System.out.println("=====================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Display original order
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (ascending capacity)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted list
        System.out.println("\nBogies Sorted by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Optional: Descending order
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nBogies Sorted by Capacity (Descending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}