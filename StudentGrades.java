import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop to take input and determine grades for 3 students
        for (int i = 0; i < 3; i++) {
            int marks = sc.nextInt(); // Take input for each student
            
            // Determine the grade based on conditions
            if (marks > 90) {
                System.out.println("A");
            } else if (marks > 70) {
                System.out.println("B");
            } else if (marks >= 40) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }
        }
        
        sc.close(); // Close the scanner
    }
}
