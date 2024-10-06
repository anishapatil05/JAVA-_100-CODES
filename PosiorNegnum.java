
// Check positive num or negative
import java.util.*;

public class PosiorNegnum {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("numbers is zero");
        }
    }
}