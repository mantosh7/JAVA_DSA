package JAVA_DSA.LOOP;

import java.util.*;

public class NthFibonacciNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter term in fibonacci series: ");
        int term = inp.nextInt();

        int temp=0, term1 = 0, term2 = 1,i=0;
        if(term==1) System.out.println(term1);
        else if(term==2) System.out.println(term2);
        else{
            while(i<term-2){
                temp = term1+term2;
                term1 = term2;
                term2 = temp;
                i++;
            }
            System.out.print(temp);
        }
    }
}
