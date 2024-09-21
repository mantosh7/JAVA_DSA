package JAVA_DSA.LOOP;

import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Enter three numbers:");
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        int num3 = n.nextInt();

        // 1st method
        if (num1 > num2) {
        if (num1 > num3) {
        System.out.print("Largest number is: " + num1);
        } else {
        System.out.print("Largest number is: " + num3);
        }
        } else {
        if (num2 > num3) {
        System.out.print("Largest number is: " + num2);
        } else {
        System.out.print("Largest number is: " + num3);
        }
        }

        // 2nd method
        int max = num1;
        if (num2 > max) {
        max = num2;
        }
        if (num3 > max) {
        max = num3;
        }
        System.out.print("Largest number is: " + max);

        // 3rd method
        int max = 0;
        System.out.println(Math.max(num3, Math.max(num1, num2)));
    }
}
