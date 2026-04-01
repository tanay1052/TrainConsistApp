import java.util.LinkedList;

/*
 * UC4: Maintain Ordered Bogie IDs using LinkedList
 */

public class U4 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC4");
        System.out.println("=====================================");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        System.out.println("\nAdding bogies to train...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Insertion:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }
}