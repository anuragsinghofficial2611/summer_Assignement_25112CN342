//Write a program to Check whether a number is palindrome
import java.util.Scanner;
public class Question4 {
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0;
        int num_copy = num;
        if (num_copy == 0) {
            digits = 1;
        }
        while(num_copy>0){
            num_copy /= 10;
            digits++;
        }
        int[] arr = new int[digits];
        for(int i = arr.length-1 ;i >= 0 ; i--){
            arr[i] = num%10;
            num /= 10;
        }
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] != arr[arr.length - i - 1]){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Number is Palindrome");
    }
}
