//Write a program to Find largest prime factor. 
import java.util.Scanner;
public class Question4 {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int num = sc.nextInt();
        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                int count = 0;
                for(int j = 1 ; j <= i ; j++){
                    if(i%j == 0) count++;
                }
                if(count<=2) ans = i;
            }
        }
        System.out.println(ans);
    }
}
