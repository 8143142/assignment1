import java.util.Scanner;

public class problem10 {
    /*
       @ GCD - definition of Euclidean Algorithm
       @ a, b - entered numbers
       @ return - returns value of GCD
   */
    public static int GCD(int a, int b) {
        if (b == 0){
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(GCD(a, b));
    }
}
