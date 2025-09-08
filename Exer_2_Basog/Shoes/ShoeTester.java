public class ShoeTester {
    public static void main(String[] args) {
        // Create a Shoe object using the no-argument constructor
        Shoe shoe1 = new Shoe();

        // Create a Shoe object using the parameterized constructor
        Shoe shoe2 = new Shoe("Nike", "Air Max 270", "Black", 9.5, "Mesh", 150.0, "Running", 2023);

        // Display information for both shoes
        System.out.println("Shoe 1 Information:");
        shoe1.displayInfo();

        System.out.println("Shoe 2 Information:");
        shoe2.displayInfo();
    }
}