package JAVA_DSA.BASIC;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int num1 = num.nextInt();

        System.out.print("Enter 2nd number:");
        int num2 = num.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}
