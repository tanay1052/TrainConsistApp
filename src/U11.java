import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * UC11: Validate Train ID & Cargo Codes (Regex)
 */

public class U11 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC11");
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);

        // Regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Take user input
        System.out.print("\nEnter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Validate using matches()
        boolean isTrainValid = trainPattern.matcher(trainId).matches();
        boolean isCargoValid = cargoPattern.matcher(cargoCode).matches();

        // Output results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID.");
        } else {
            System.out.println("Train ID is INVALID.");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID.");
        } else {
            System.out.println("Cargo Code is INVALID.");
        }

        System.out.println("\nProgram continues...");
        sc.close();
    }
}
