import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num = Reader.nextInt(); // Fixed the typo here
        
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        
    }
}
