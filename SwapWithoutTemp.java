public class SwapWithoutTemp {
    public static void main(String[] args) {
        int first = 15;
        int second = 20;
        System.out.println("before swapping: First:" + first +" " + "Second " + second);

        first = first - second;
        second = first + second;
        first = second - first;
         System.out.println("After swapping: First:" + first + " " + "Second:" + second);


    }
}
