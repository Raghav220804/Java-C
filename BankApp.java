public class BankApp {
    public static void main(String[] args) {
        // Creating an object of the Bank class
        Bank customer1 = new Bank();

        // Accessing class members via the object
        customer1.createAccount(1001, "Roel", 1000);
        System.out.println("Current Balance: " + customer1.getBalance());

        customer1.deposit(500);
        System.out.println("Current Balance: " + customer1.getBalance());

        int result = customer1.withdraw(212340);
        if (result == 1)
            System.out.println("Current Balance: " + customer1.getBalance());
        else if (result == 0)
            System.out.println("Amount should be multiples of 100");
        else
            System.out.println("Insufficient funds");
            System.out.println(("Actual Balance: " + customer1.getBalance()));
    }
}
