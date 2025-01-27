import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number for the multiplication table:");
        int num = reader.nextInt();
        
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 12; ++i) {
            System.out.printf("%d * %d = %d%n", num, i, num * i); 
        }
    }
}
