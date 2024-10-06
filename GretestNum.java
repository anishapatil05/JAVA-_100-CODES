// Find out Gretest of 2 numbers
import java.util.*;
public class GretestNum {
    public static void main(String[] args){
        int num1=13, num2=56;

        if(num1 == num2)
        {
            System.out.println("Both are equal");
        }else
        {
            int res = (num1> num2)? num1:num2;
            System.out.println(res);
        }
    }
}

