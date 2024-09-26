package JAVA_DSA.ARRAY_ARRAYLIST;
import java.util.*;
public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        swap(arr,2,7);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
