 // rite a program to Check whether a number is prime. 
import java.util.Scanner;
class Question1 {
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                if(i != 1 && i != num){
                    System.out.println("Not a Prime Number");
                    return;
                }
            }
        }
        System.out.println("Prime Number");
    }
}