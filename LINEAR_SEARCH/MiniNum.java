package JAVA_DSA.LINEAR_SEARCH;

public class MiniNum {
    public static void main(String[] args) {
        int[] arr = { -12, -10, 25, -233, -156, 456, 741 };
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
