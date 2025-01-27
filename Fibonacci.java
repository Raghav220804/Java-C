import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("n:");
        int n = reader.nextInt();
        int firstTerm = 0, secondTerm = 1;
        for (int i = 0; i<=n; ++i){
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        

        }
        


    }
}

