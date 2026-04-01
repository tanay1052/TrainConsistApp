import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
 * UC13: Performance Comparison (Loops vs Streams)
 */

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class U13 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC13");
        System.out.println("=====================================");

        // Create a large dataset
        List<Bogie> bogies = generateBogies(200_000); // adjust size if needed

        // -------- Loop-based filtering --------
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // -------- Stream-based filtering --------
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // -------- Results --------
        System.out.println("\nLoop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nLoop Time   (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);

        // Optional: convert to milliseconds for readability
        System.out.println("\nLoop Time   (ms): " + loopTime / 1_000_000.0);
        System.out.println("Stream Time (ms): " + streamTime / 1_000_000.0);

        System.out.println("\nResults match: " + (loopResult.size() == streamResult.size()));

        System.out.println("\nProgram continues...");
    }

    // Helper to generate random dataset
    private static List<Bogie> generateBogies(int size) {
        List<Bogie> list = new ArrayList<>(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int capacity = 20 + rand.nextInt(100); // random 20–119
            list.add(new Bogie("Bogie-" + i, capacity));
        }
        return list;
    }
}