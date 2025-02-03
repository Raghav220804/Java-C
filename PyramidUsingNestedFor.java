import java.util.Scanner;
public class PyramidUsingNestedFor {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = reader.nextInt();

        for(int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; ++j){
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}
}
