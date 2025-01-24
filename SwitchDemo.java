public class SwitchDemo {
 public static void main(String[] args) {
   // float f = 1.0f;
    //switch(f) {
      //  case 1:
       // System.out.println(x: "One )break;
        //default:
        //sysout.println(x: "False"
        //int day = new java.util.Scanner(System.in).nextInt();
        //switch(day) {
          //  case 1 ->System.out.println("its Monday, Concentrate on studies");
            //case 2,3,4 -> System.out.println("Still it's weekday only");
            //case 5-> System.out.println("it's Friday, get ready for weekend");
            //case 6,7 -> System.out.println("Enjoy the weekend");
            //default-> System.out.println("Invalid day of the week");

            int day = new java.util.Scanner(System.in).nextInt();
            System.out.println(switch (day) {
                case 1 -> "its Monday, Concentrate on studies";
                case 2, 3, 4 -> "Still it's weekday only";
                case 5 -> "it's Friday, get ready for weekend";
                case 6, 7 -> "Enjoy the weekend";
                default -> "Invalid day of the week";
            });
        }
    }
            