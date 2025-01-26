public class MethodDemo {
    private static boolean isVowel(char ch) {
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        // return true;
        // else
        // return false;

        return "aeiouAEIOU".contains("" + ch);
    }

    private static boolean isPrime(int n) { // Corrected parameter name from `x` to `n`
        if (n <= 1) //  condition for non-prime numbers
            return false;
        if (n > 3 && (n % 2 == 0 || n % 3 == 0))
            return false;
        for (int i = 5; i <= Math.sqrt(n); i += 6) // Use `<=` for the loop to include square root
            if (n % i == 0 || n % (i + 2) == 0) // Added parentheses to fix syntax error
                return false;
        return true;
    }

    public static void main(String[] args) throws java.io.IOException {
        // MethodDemo demo = new MethodDemo(); // Create an instance to call the isVowel method
        // char x = (char) System.in.read(); // Read input as a character
        // if (demo.isVowel(x)) { // Call isVowel using the instance
        // System.out.println("Vowel");
        // } else {
        // System.out.println("Consonant");
        // }

        int x = new java.util.Scanner(System.in).nextInt(); // Fixed typo `nextTnt` to `nextInt`
        System.out.println(isPrime(x) ? "Prime" : "Not Prime");
    }
}
