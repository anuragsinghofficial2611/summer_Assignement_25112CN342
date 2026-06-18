//write a program to Print prime numbers in a  range
import java.util.Scanner;
public class Question2 {
    public static void main(String args[]){
        System.out.print("Enter the starting point of range : ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.print("Enter the ending point of range : ");
        int end = sc.nextInt();
        int count = 0;
        for(int i = start ; i <= end ; i++){
            count = 0;
            for(int j = 1 ; j <= i; j++){
                if(i % j == 0) count++;
            }
            if(count == 2) System.out.println(i+"is prime");
            else System.out.println(i+"is not prime");
        }
    }
}
