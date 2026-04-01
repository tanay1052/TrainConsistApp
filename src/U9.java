import java.util.*;
import java.util.stream.Collectors;

/*
 * UC9: Group Bogies by Type (Collectors.groupingBy)
 */

// Bogie class (extended with type/category)
class Bogie {

    private String name;
    private int capacity;
    private String type; // Passenger or Goods

    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class U9 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC9");
        System.out.println("=====================================");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cylindrical", 120, "Goods"));
        bogies.add(new Bogie("Sleeper", 72, "Passenger")); // duplicate type example

        // Display original list
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Display grouped result
        System.out.println("\nGrouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nProgram continues...");
    }
}