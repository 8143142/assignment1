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
