public class CarRental {
    // Class data members
    private int carId;
    private String carType;
    private float rent;

    // Class member methods
    public void getcar(int carId, String carType) {
        this.carId = carId;
        this.carType = carType.toUpperCase();
        this.rent = switch (this.carType) {
            case "SMALL CAR" -> 1000.0F;
            case "VAN" -> 800.0F;
            case "SUV" -> 2500.0F;
            default -> 0.0F;
        };
    }

    public float getRent() {
        return rent;
    }

    public String showCar() {
        return "[" + carId + ", " + carType + ", " + rent + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        CarRental car = new CarRental();
        car.getcar(101, "SUV");
        System.out.println(car.showCar());

        car.getcar(102, "Small Car");
        System.out.println(car.showCar());

        car.getcar(103, "Van");
        System.out.println(car.showCar());

        car.getcar(104, "Unknown Type");
        System.out.println(car.showCar());
    }
}
