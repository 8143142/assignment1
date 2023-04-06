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
