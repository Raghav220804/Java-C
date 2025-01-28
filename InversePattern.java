import java.util.Scanner;
public class InversePattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = reader.nextInt();

        for (int i= rows; i>=1; --i){
            for (int j = 1; j<= i; ++j){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
