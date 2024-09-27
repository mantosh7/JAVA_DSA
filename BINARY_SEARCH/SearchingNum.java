package JAVA_DSA.BINARY_SEARCH;

public class SearchingNum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 56 };
        int target = 480;
        binarySearch(arr, target);
    }

    static void binarySearch(int[] arr, int target) {
        int mid, start = 0, end = arr.length - 1;
        boolean flag = false;

        while (start <= end && flag == false) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.print(arr[mid] + " is found at index " + mid);
                flag = true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start > end && flag == false) {
            System.out.print(target + " does not exist in the given array.");
        }
    }
}
