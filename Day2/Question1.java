//Write a program to Find sum of digits of anumber.
import java.util.Scanner;
public class Question1 {
    public static void main(String args[]){
        System.out.print("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
