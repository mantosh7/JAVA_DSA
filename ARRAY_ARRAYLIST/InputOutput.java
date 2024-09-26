package JAVA_DSA.ARRAY_ARRAYLIST;
import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter elements for array: ");
        // taking input
        for(int i=0;i<5;i++)
        {
            arr[i]=s1.nextInt();
        }

        // printing array using Arrays.toString() method --> this method internally use loop to convert each element of cleararray to string
        System.out.print(Arrays.toString(arr)); 
    }
}




