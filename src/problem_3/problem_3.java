package problem_3;
import java.util.Scanner;
public class problem_3 { public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter three values:");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
       System.out.println("All the same: " + allTheSame(x,y,z));
        System.out.println("All different: " + allDifferent(x, y, z) );
        System.out.println("Sorted (smallest to largest) " + sorted(x, y, z));}
   public static boolean allTheSame(double x, double y, double z) {
        return x == y && y == z;
    }
   public static boolean allDifferent(double x, double y, double z) {
        return x != y || x != z || y != z;
    }
   public static boolean sorted(double x, double y, double z) {
        return x <= y && z >= y;
    }
}
