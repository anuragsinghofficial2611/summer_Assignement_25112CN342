
//Write a program to Find nth Fibonacci term. 

import java.util.Scanner;

public class Question2 {
    public static void main(String args[]){
        System.out.print("Enter new Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i <= num; i+=2){
            System.out.println(num1);
            System.out.println(num2);
            num1 = num1+num2;
            num2 = num1+num2;
            
        }
    }
}
