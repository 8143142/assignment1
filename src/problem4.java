import java.util.Scanner;

public class problem4 {
    /*
       @ fact - definition of factorial
       @ n - entered number
       @ return - returns factorial
   */
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n-1);
        }
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }
}
