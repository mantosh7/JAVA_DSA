package JAVA_DSA.ARRAY_ARRAYLIST;

import java.util.*;

public class EvenDigitNum {
    public static void main(String[] args) {
        int[] arr = { 11, 122, 33, 123, 46 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int countDigit = 0, rem = 0;

            while (arr[i] > 0) {
                rem = arr[i] % 10;
                arr[i] /= 10;
                countDigit++;
            }
            if (countDigit % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number having even digit s= " + count);
    }
}
