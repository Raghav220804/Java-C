public class Bank {
    // class data members
    // instance variables;
    // attribute
    // Fields
    // states of an object
    // Properties of an object
    private int accNo;
    private String accName;
    private double balance;

    public void createAccount(int number, String name, double initialAmount) {
        accNo = number;
        accName = name;
        balance = initialAmount;
    }

    public boolean deposit(double amount) {
        if (amount % 100 == 0) {
            balance += amount;
            return true; // Deposit successful
        }
        return false; // Deposit failed
    }

    public int withdraw(double amount) {
        if (amount % 100 == 0) {
            if (balance >= amount) {
                balance -= amount;
                return 1; // Withdrawal successful
            } else {
                return -1; // Insufficient balance
            }
        }
        return 0; // Invalid amount (not a multiple of 100)
    }
    public double getBalance() {
        return balance;
    }
}
