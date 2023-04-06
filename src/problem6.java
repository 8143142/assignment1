import java.util.Scanner;

public class problem6 {
    /*
       @ func - definition of power function
       @ a - entered number
       @ n - power
       @ return - returning powered a
   */
    public static int func(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * func(a, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(func(a, n));
    }
}
