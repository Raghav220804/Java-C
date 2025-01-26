public class Employee {
    // Instance variables
    private static String CompanyName = "AaronTechnologies";
    private int empID;
    private String empName;
    private double salary;

    // Default constructor
    public Employee() {
        // Default constructor with no initialization
    }

    // Parameterized constructor
    // Constructor overloading
    public Employee(int empID, String empName, double salary) {
      
    }

    // Method to get the company name
    public String getCompanyName() {
        int x, y, z;
        x = y = z = 100; // Assigning 100 to x, y, and z
        System.out.println(x + " " + y + " " + z);
        return CompanyName; // Returning the company name
    }
}
