import java.util.HashSet;
import java.util.Set;

/*
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 */

public class U3 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC3");
        System.out.println("=====================================");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        System.out.println("\nAdding Bogie IDs...");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display bogie IDs
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically ignored.");

        System.out.println("\nProgram continues...");
    }
}