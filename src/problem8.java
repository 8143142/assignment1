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
