//Write a program to Find LCM of two numbers.
import java.util.Scanner;

public class Question4 {
    public static void main(String args[]){
        System.out.print("Enter First number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter the second number");
        int num2 = sc.nextInt();
        for(int i = 1; i <= num*num2; i++){
            if((i % num == 0) && (i % num2 == 0)){
                System.out.println(i+"is the LCM of two numbers");
                break;
            }
        }
    }
}
