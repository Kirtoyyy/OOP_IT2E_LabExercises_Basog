public class Shoe {
    private String brand;
    private String model;
    private String color;
    private double size;
    private String material;
    private double price;
    private String type; // e.g., Running, Casual, Formal
    private int year;

    // No-argument constructor
    public Shoe() {
        this.brand = "No Brand";
        this.model = "No Model";
        this.color = "No Color";
        this.size = 0.0;
        this.material = "No Material";
        this.price = 0.0;
        this.type = "No Type";
        this.year = 0;
    }

    // Parameterized constructor
    public Shoe(String brand, String model, String color, double size, String material, double price, String type, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.material = material;
        this.price = price;
        this.type = type;
        this.year = year;
    }

    // Method to display shoe information
    public String displayInfo() {
        String info = "";
        info += "Shoe Brand: " + brand + "\n";
        info += "Shoe Model: " + model + "\n";
        info += "Shoe Color: " + color + "\n";
        info += "Shoe Size: " + size + "\n";
        info += "Shoe Material: " + material + "\n";
        info += "Shoe Price: $" + price + "\n";
        info += "Shoe Type: " + type + "\n";
        info += "Shoe Year: " + year + "\n";
        System.out.println(info);
        return info;
    }
}