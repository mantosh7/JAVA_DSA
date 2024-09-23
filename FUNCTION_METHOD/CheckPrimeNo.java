package JAVA_DSA.FUNCTION_METHOD;

import java.util.*;

public class CheckPrimeNo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = s1.nextInt();

        // 1st method
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }

        if(count==2){
            System.out.print("Prime number");
        }
        
        else{
            System.out.print("Not prime number");
        }



        // 2nd method
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n) {
        if(n<=1) return false;
        
        int c=2;
        while(c*c<n){
            if(n%c==0) return false;
            c++;
        }


        if(c*c>n) return true;

        return false;
    }
}
