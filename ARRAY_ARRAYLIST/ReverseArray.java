package JAVA_DSA.ARRAY_ARRAYLIST;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] brr){
        int temp=0;
        for(int i=0,j=(brr.length)-1;i<j;i++,j--)
        {
            temp = brr[i];
            brr[i] = brr[j];
            brr[j]=temp;
        }

    }
}
