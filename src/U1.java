import java.util.ArrayList;
import java.util.List;

/*
 * UC1: Initialize Train and Display Consist Summary
 */

public class U1 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App");
        System.out.println("=====================================");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        System.out.println("\nTrain initialized successfully.");
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("\nProgram ready for next operations...");
    }
}