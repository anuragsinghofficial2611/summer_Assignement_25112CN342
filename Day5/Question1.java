//Write a program to Check perfect number. 
import java.util.*;
public class Question2 {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0) sum += i;
        }
        if(sum == num) System.out.println("Perfect Number");
        else System.out.println("Not perfect number");
    }
}
