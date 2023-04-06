import java.util.Scanner;

public class problem9 {
    /*
       @ binom - definition of binomial coefficient
       @ n, k - given numbers
       @ return - returns binomial coefficient
   */
    public static int binom(int n, int k) {
        if(n == k || k == 0){
            return 1;
        }
        else{
            return binom(n-1, k-1) + binom(n-1, k);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.print(binom(n, k));
    }
}

