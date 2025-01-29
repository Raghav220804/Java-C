import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
         float num1 = reader.nextFloat();

        System.out.println("Enter an operator: +, - , * or /");
        char operator = reader.next().charAt(0);

        System.out.println("Enter another number");
        float num2 = reader.nextFloat();

        double result = 0;

        switch(operator){
            case '+':
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*':
            result = num1 * num2;
            break;
            case '/':
            if(num2 != 0){
            result = num1/num2;
            }
            else{
                System.out.println("number cannot be divided by 0");
            }
            break;
            default:
            System.out.println("Invalid operator");
           

        }
        System.out.println("Result:" + result);
        reader.close();


        


    }
    

}