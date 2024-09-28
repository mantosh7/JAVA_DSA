package JAVA_DSA.BINARY_SEARCH_QUES;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-4,-1,2,3,5,9,14,16,18,36};
        int target = 8;
        int ans = binarySearch(arr,target);
        System.out.println(arr[ans]);
    }

    static int binarySearch(int[] arr,int target)
    {
        int start = 0; 
        int end = arr.length-1; 
        int mid;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if((mid<0)||(mid-1<0))
            {
                return 0;
            }
            
            if(arr[mid]>target && arr[mid-1]<target){
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }       
        }
        return -1;
    }

    // method 2
    // static int binarySearch(int[] arr, int target) {
    //     int mid, start = 0, end = arr.length - 1;

    //     while (start <= end) {
    //         mid = start + (end - start) / 2;
    //         if (arr[mid] == target) {

    //             return mid;
    //         } else if (arr[mid] < target) {
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }
    //     }
    //     return start;
    // }
}
