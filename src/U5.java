import java.util.LinkedHashSet;
import java.util.Set;

/*
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 */

public class U5 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC5");
        System.out.println("=====================================");

        // LinkedHashSet maintains insertion order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        System.out.println("\nAttaching bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate 'Sleeper'...");
        boolean added = trainFormation.add("Sleeper"); // will be ignored

        if (!added) {
            System.out.println("Duplicate ignored: 'Sleeper' already exists.");
        }

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nProgram continues...");
    }
}
