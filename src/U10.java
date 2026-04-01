import java.util.ArrayList;
import java.util.List;

/*
 * UC10: Count Total Seats in Train (reduce)
 */

// Reusing Bogie structure
class Bogie {

    private String name;
    private int capacity;
    private String type;

    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class U10 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC10");
        System.out.println("=====================================");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));

        // Display bogies
        System.out.println("\nBogie List:");
        bogies.forEach(System.out::println);

        // Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // sum all values

        // Display total capacity
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nProgram continues...");
    }
}