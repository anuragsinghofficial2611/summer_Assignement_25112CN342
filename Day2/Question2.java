//Write a program to Reverse a number. 
import java.util.Scanner;
public class Question2 {
    public static void main(String args[]){
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        int rev = 0;
        int digits = 0;
        int num_copy = num;
        while(num_copy>0){
            digits++;
            num_copy /= 10;
        }
        for(int i = 1 ;i < digits; i++){
            n *= 10;
        }
        while(num>0){
            rev += n*(num%10);
            n /= 10;
            num /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
