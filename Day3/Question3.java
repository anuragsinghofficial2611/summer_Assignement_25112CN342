//Write a program to Find GCD of two numbers. 

import java.util.Scanner;
public class Question3{

    public static void main(String args[]) {
        System.out.print("Enter first number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= Math.min(num, num2); i++) {
            if (num % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd + "is the GCD of given number");

    }
}
