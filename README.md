# assignment1 documentation <img src="https://github.com/blackcater/blackcater/raw/main/images/Hi.gif" height="32"/></h1>
Here is full explanation of codes
--------    ---------    --------
<b><p>task 1<p></b>
<b>Description:</b> *Return minimum value of array*<br><br>
<b>Explanation:</b> *Firstly we identify the base case. It is ```n=1```. Then we return the first element of the array by comparing the ```arr[n-1]``` element with the recursive execution of the function.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
import java.util.Scanner;

public class Main {
    /*
        @ findMin - definition of min
        @ size - length of array
        @ arr - array
        @ return - returning minimum value
    */
    public static double calculateAverage(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = (double) sum / n;
        return average;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        int n = arr.length;
        double average = calculateAverage(n, arr);
        System.out.println("The average is: " + average);
    }
}
```
--------    ---------    --------
<b><p>task 2<p></b>
<b>Description:</b> *Return average value of array*<br><br>
<b>Explanation:</b> *Here is main function ```calculateAverage``` which finds the sum of all values of array and then divides it to the length.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
import java.util.Scanner;

public class problem2 {
    /*
       @ calculateAverage - definition of average value
       @ size - length of array
       @ arr - array
       @ return - returning average value
   */
    public static double calculateAverage(int size, int[] arr) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return (double) sum / size;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        double average = calculateAverage(size, arr);
        System.out.println("The average is: " + average);
    }
}
```
--------    ---------    --------
<b><p>task 3<p></b>
<b>Description:</b> *checks the number for a prime*<br><br>
<b>Explanation:</b> *Here is main function ```IsPrime```, here we simplify the algorithm to ```O(sqrt(n))``` , we cycle through each of the numbers with 2, because it is the minimum prime number up to sqrt(n) and check for divisibility.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
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
```
--------    ---------    --------
<b><p>task 4<p></b>
<b>Description:</b> *Calculates factorial*<br><br>
<b>Explanation:</b> *First, if n equals 1, we return 1. (the 1st element in the sequence). If not, increase the current number by one less than the factorial of the number.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
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
```
--------    ---------    --------
<b><p>task 5<p></b>
<b>Description:</b> * Return the number on n-th position of fibonacci sequence*<br><br>
<b>Explanation:</b> *We return the corresponding values if ```n=0``` or ```n=1```. These are the two fundamental requirements. The total of two recursions with arguments ```n-1``` and ```n-2``` in the absence of that.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
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
```
--------    ---------    --------
<b><p>task 6<p></b>
<b>Description:</b> *Return base in power n*<br><br>
<b>Explanation:</b> *We simply return base when ```base=1```.
We just return 1 when base is 0 (b.c. n^0 = 1).
If not, we return base*power(base, power-1), which forces us to repeat the loop n times.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
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
```
--------    ---------    --------
<b><p>task 7<p></b>
<b>Description:</b> *Reverse an array*<br><br>
<b>Explanation:</b> *While start stop, we increase start and decrease stop variables and swap array members based on start and stop indexes. In this case, base ```start=0```, ```stop=arr.length-1```.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
import java.util.Scanner;

public class problem7 {
    /*
       @ reverse - definition of reverse array
       @ n - length of array
       @ arr - array
   */
    public static void reverse(int n, int[] arr) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        reverse(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```
--------    ---------    --------
<b><p>task 8<p></b>
<b>Description:</b> *Checks is provided string is integer*<br><br>
<b>Explanation:</b> *Boolean ```CheckDigit``` returns true or false by checking conditions.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
import java.util.Scanner;

public class problem8 {
    /*
       @ CheckDigit - definition of function for checking “s” to digits
       @ s - entered string
       @ return - returns true or false
   */
    public static boolean CheckDigit(String s) {
        if (s.length() == 0) {
            return true;
        }
        else {
            char firstChar = s.charAt(0);
            if (Character.isDigit(firstChar)) {
                return CheckDigit(s.substring(1));
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if(CheckDigit(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
```
--------    ---------    --------
<b><p>task 9<p></b>
<b>Description:</b> * Return binomial coefficient of n and k params*<br><br>
<b>Explanation:</b> *If ```k=n```, we always return 1; if ```k=0```, we also return 1; if otherwise, we return the sum of the functions again with the parameters ```(n-1, k-1)``` and ```(n-1, k)```.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
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
```
--------    ---------    --------
<b><p>task 10<p></b>
<b>Description:</b> *Calculates GCD of a and b*<br><br>
<b>Explanation:</b> *baseline: if ```b=0```, we return a; If not, we call the function recursively with ```(b, a% b)```.*<br><br>
<b>Full code with some comments:</b>:white_check_mark:
```
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
```
