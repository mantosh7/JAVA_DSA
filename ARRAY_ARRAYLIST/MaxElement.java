package JAVA_DSA.ARRAY_ARRAYLIST;

import java.util.*;

public class MaxElement {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter no.of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        // taking input elements
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        // finding max element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Maximum element is: " + max);
    }
}
