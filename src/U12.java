import java.util.ArrayList;
import java.util.List;

/*
 * UC12: Safety Compliance Check for Goods Bogies
 */

// Goods Bogie class
class GoodsBogie {

    private String type;   // Cylindrical / Open / Box
    private String cargo;  // Petroleum / Coal / Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class U12 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC12");
        System.out.println("=====================================");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        goodsBogies.add(new GoodsBogie("Open", "Coal"));             // valid
        goodsBogies.add(new GoodsBogie("Box", "Grain"));             // valid

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety check using allMatch
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Check:");
        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is NOT SAFE! Rule violation detected.");
        }

        System.out.println("\nProgram continues...");
    }
}