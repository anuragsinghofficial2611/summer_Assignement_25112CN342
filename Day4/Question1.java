//Write a program to Generate Fibonacci series. 
public class Question1 {
    public static void main(String args[]){
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i < 20; i++){
            System.out.println(num1);
            System.out.println(num2);
            num1 = num1+num2;
            num2 = num1+num2;
        }
    }
}
