//Write a program to Print Armstrong numbers in a range.
public class Question4 {
    public static void main(String args[]){
        
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            int digit = 0;
            int copy = i;
            while(copy>0){
                copy/=10;
                digit++;
            }
            int copy2 = i;
            int sum = 0;
            while(copy2>0){
                int dig = copy2%10;
                sum += Math.pow(dig,digit);
                copy2 /= 10;
            }
            if(sum == i) System.out.println(i);
        }
    }
}
