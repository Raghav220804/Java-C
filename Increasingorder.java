import java.util.Scanner;
public class Increasingorder {
    public static void main(String[] args){
        int x,y,z,max,mid,min;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        max = Math.max(Math.max(x,y),z);
        min = Math.min(Math.min(x,y),z);
        mid = (x+y+z) - (max+min);
        System.out.println("Increasing order: " + min + " " + mid + " " + max);
        in.close();
    }
}
