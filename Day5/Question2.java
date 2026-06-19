//Write a program to Check strong number. 
import java.util.Scanner;
public class Question2 {
    public static void main(String args[]){
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int n = num;
        while(num>0){
            int digit = num%10;
            int product = 1;
            for(int i = 1; i <= digit; i++){
                product *= i;
            }
            sum += product;
            num /= 10;
        }
        if(sum == n) System.out.println("Entered number is strong number");
        else System.out.println("Entered number is not strong number");
    }

}