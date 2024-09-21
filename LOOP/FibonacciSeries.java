package JAVA_DSA.LOOP;

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter no.of terms in fibonacci series: ");
        int term = inp.nextInt();

        int temp = 0;
        int term1 = 0;
        int term2 = 1;
        if (term == 1) {
            System.out.println(term1 + " ");
        } else if (term == 2) {
            System.out.println(term1 + " ");
            System.out.println(term2 + " ");
        } else {
            System.out.print(term1 + " ");
            System.out.print(term2 + " ");
            for (int i = 0; i < term - 2; i++) {
                temp = term1 + term2;
                System.out.print(temp + " ");
                term1 = term2;
                term2 = temp;

            }
        }

    }
}
