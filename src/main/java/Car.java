public class Car {
    // CAR INFORMATION
    String brand = "Cadilac";
    String model = "Cadilac CT4";
    int buildYear = 2024;
    String vin = "234235235";
    String color = "";

    // METHOD TO DISPLAY CAR INFORMATION
    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Build Year: " + buildYear);
        System.out.println("VIN: " + vin);
        System.out.println("--------------------");
    }
    static void dealershipInfo() {
        System.out.println("Welcome to the future of RentalCars");
    }
}
