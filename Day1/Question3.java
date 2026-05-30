//Write a program to Find factorial of a number. 
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i <=n ; i++){
            fact*=i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
