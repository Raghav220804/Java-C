import java.util.Scanner;
public class Size {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number from 29,42,44,48:");

        int num = reader.nextInt();
        switch(num){
            case 29:
            System.out.println("Size is small");
            break;
            case 42:
                System.out.println("Size is medium");
                break;
            case 44:
                System.out.println("Size is large");
            break;
            case 48:
                System.out.println("Size is extra large");
                break;
            default:
            System.out.println("Unknown size");
        }
    }
    
}
