import java.util.ArrayList;
import java.util.List;

/*
 * UC16: Sort Passenger Bogies by Capacity (Bubble Sort)
 */

class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class U16 {

    // Bubble Sort (Ascending by capacity)
    public static void bubbleSort(List<PassengerBogie> bogies) {
        int n = bogies.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (bogies.get(j).capacity > bogies.get(j + 1).capacity) {
                    // swap
                    PassengerBogie temp = bogies.get(j);
                    bogies.set(j, bogies.get(j + 1));
                    bogies.set(j + 1, temp);
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC16");
        System.out.println("=====================================");

        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("General", 90));

        System.out.println("\nBefore Sorting:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        // Apply Bubble Sort
        bubbleSort(bogies);

        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}
