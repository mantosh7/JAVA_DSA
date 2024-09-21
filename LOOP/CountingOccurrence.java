package JAVA_DSA.LOOP;

import java.util.*;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number:");
        int n = inp.nextInt();

        System.out.print("Enter digit to be count:");
        int digit = inp.nextInt();

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == digit)
                count++;
        }

        System.out.print("Occurrence of " + digit + " = " + count);

    }
}
