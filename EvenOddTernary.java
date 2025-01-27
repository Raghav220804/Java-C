import java.util.Scanner;
public class EvenOddTernary {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number:");

        int num = reader.nextInt();

        String EvenOddTernary = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num +" "+ "is" + " "+ EvenOddTernary);


    }
}
