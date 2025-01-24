//public class Sumofdigits {
   // public  static void main(String[] args)
    
//}
import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt and read input
        System.out.print("Enter a number: ");
        int number = Math.abs(scanner.nextInt()); // Read and take absolute value

        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // Print the result
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
