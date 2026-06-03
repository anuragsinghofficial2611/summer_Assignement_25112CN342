//rite a program to Print prime numbers in a  range
import java.util.Scanner;
public class Question2 {
    public static void main(String args[]){
        System.out.print("Enter the starting point of range : ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.print("Enter the ending point of range : ");
        int end = sc.nextInt();
        for(int i = start ; i <= end ; i++){
            System.out.println(i);
        }
    }
}
