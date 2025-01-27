import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if (num < 0){
            System.out.println("Number is negative");
        }
        else if (num > 0){
            System.out.println("Number is positve.");

        }
        else {
            System.out.println("Number is 0");
        }
    }
}
