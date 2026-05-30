//Write a program to Calculate sum of first N natural numbers. 
import java.util.Scanner;
class Question1 {
    public static void main(String[] args){
        System.out.print("Enter a number: ");5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ;i <= n ; i++){
            sum+=i;
            
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}