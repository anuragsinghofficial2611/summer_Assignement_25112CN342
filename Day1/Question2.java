// Write a program to Print multiplication table of a given number.
import java.util.Scanner;
class Question2 {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= 10 ; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }

    }
}