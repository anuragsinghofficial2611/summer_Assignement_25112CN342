//Write a program to Check Armstrong number. 
import java.util.*;
public class Question3 {
    public static void main(String args[]){
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int digit = 0;
        int copy = num;
        while(copy > 0){
            copy /= 10;
            digit++;
        }
        int nums = num;
        for(int i = 0; i < digit ; i++){
            int dig = nums%10;
            sum += Math.pow(dig,digit);
            nums /=10;
        }
        if(sum == num) System.out.println("number is armstrong");
        else System.out.println("number is not armstrong");

    }
}
