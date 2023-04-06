import java.util.Scanner;

public class Main {
    /*
        @ findMin - definition of min
        @ size - length of array
        @ arr - array
        @ return - returning minimum value
    */
    public static int findMin(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int minVal = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        int minVal = findMin(arr);
        System.out.println(minVal);
        scanner.close();
    }
}