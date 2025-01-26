public class CarRentalTest {
    public static void main(String[] args) {
        CarRental myCar1 = new CarRental();
        
        // Set car details
        myCar1.getcar(7065, "SUV");
        
        // Display rent
        System.out.println("Rent: " + myCar1.getRent());
        
        // Display car details
        System.out.println("Car Details: " + myCar1.showCar());
    }
}
