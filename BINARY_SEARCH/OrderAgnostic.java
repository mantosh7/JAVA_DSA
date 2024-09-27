package JAVA_DSA.BINARY_SEARCH;

public class OrderAgnostic {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 56 };
        int[] arr = { 99,87,67,54,45,40,36,35,21,20,19,10 };

        int target = 35;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int mid, start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];   // for checking whether the given array is sorted in ascending orin  descending order


        while (start <= end ) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc)
            {
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

            else{
                if (arr[mid] > target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            
        }

        return -1;
    }
}
