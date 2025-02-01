import java.util.Scanner;
public class Sumofpositiveinteger {
    public static void main(String[] args) {
       int sum = 0;

       Scanner input = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = input.nextInt();
       while (num >=0){
        sum += num;
        System.out.println("Enter a number:");
        num = input.nextInt();

       }
       System.out.println("Sum of positive integers: " + sum);
       input.close();

    }
}
