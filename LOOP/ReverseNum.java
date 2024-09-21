package JAVA_DSA.LOOP;

import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = inp.nextInt();
        
        int dup = n,rem=0,sum=0;

        while(dup>0)
        {
            rem=dup%10;
            sum=sum*10+rem;
            dup/=10;
        }

        System.out.print("Reverse = "+sum);

    }
}
