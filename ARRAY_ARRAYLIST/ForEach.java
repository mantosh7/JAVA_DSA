package JAVA_DSA.ARRAY_ARRAYLIST;

import java.util.*;
   
public class ForEach {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s1.nextInt();
        }

        // printing elements of array
        for(int num:arr){    // for every element in array
            System.out.print(num+" ");   // here num represents element of array
        }
    }
}


