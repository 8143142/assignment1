import java.util.Scanner;

public class problem3 {
    /*
       @ isPrime - definition of prime
       @ n - entered number
       @ return - returns false or true
   */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is composite");
        }
    }
}
