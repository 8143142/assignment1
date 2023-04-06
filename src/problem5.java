import java.util.Scanner;

public class problem5 {
    /*
       @ Fibonacci - definition of Fibonacci
       @ n - entered number
       @ return - returning n-th number on Fibonacci
   */
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
    }
}
