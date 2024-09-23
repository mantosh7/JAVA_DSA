package JAVA_DSA.FUNCTION_METHOD ;

import java.util.*;
import java.lang.Math;

public class ArmstrongNum {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = s1.nextInt();

        int length = len(num);
        checkArmstrong(num,length);
    }

    static int len(int n){
        int rem=0,count=0;
        while(n>0){
            rem=n%10;
            count++;
            n/=10;
        }
        return count;

    }

    static void checkArmstrong(int n,int length){
        int temp=n,sum=0,rem=0;
        while(temp>0){
            rem=temp%10;
            temp/=10;
            sum+=Math.pow(rem,length);
        }
        if(sum==n){
            System.out.print("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}