import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner Alphabet = new Scanner(System.in);

        System.out.println("Enter alphabet");

        String alphabet = Alphabet.nextLine();

        switch (alphabet) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(alphabet + " is a vowel");
                break;
            default:
                System.out.println(alphabet + " is not a vowel");
                break;
        }

       
    }
}
