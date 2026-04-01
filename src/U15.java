/*
 * UC15: Safe Cargo Assignment Using try-catch-finally
 */

// Custom runtime exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods bogie class
class GoodsBogie {

    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
        this.cargo = "None";
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    public void assignCargo(String cargoType) {
        try {
            // Unsafe rule: Rectangular bogie cannot carry Petroleum
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe cargo assignment: Petroleum cannot be assigned to a Rectangular bogie."
                );
            }

            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType + " → " + shape + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment check completed for " + shape + " bogie.");
        }
    }

    @Override
    public String toString() {
        return shape + " Bogie [Cargo = " + cargo + "]";
    }
}

public class U15 {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" Train Consist Management App - UC15");
        System.out.println("=====================================");

        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        // Safe assignment
        cylindrical.assignCargo("Petroleum");

        System.out.println();

        // Unsafe assignment
        rectangular.assignCargo("Petroleum");

        System.out.println();

        // Program continues safely
        rectangular.assignCargo("Coal");

        System.out.println("\nFinal Bogie States:");
        System.out.println(cylindrical);
        System.out.println(rectangular);

        System.out.println("\nProgram continues safely...");
    }
}