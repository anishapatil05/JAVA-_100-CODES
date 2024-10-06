
// Sum of numbers within a range
import java.util.*;

public class SuminRange {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
