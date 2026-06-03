// Write a program to Find product of digits. 
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int product = 1;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            product *= n % 10;
            n = n / 10;
        }
        System.out.println("Product of digits is: " + product);
        sc.close();
    }
}
