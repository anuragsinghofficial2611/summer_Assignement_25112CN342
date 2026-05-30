//Write a program to Count digits in a number.
import java.util.Scanner ;
public class Question4 {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ;
        if(n < 0) n = 0-n;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println("Enter number has " + count + " digits");
    }
}
