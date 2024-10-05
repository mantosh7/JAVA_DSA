package JAVA_DSA.BINARY_SEARCH_QUES;
import java.util.*;
public class PeakIndexMountain {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1};
        int ans=search(arr);
        
        System.out.println(arr[ans]);
    }

    static int search(int[] arr)
    {
        int start=0,end=arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            int target=arr[mid];

            if(arr[mid+1]<target && arr[mid-1]<target)
            {
                return mid;
            }
            else if(arr[mid+1]>target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}



// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int target=arr[0];
//         int ans=search(arr,target);
//         return ans;
//     }

//     public int search(int[] arr,int target)
//     {
//         int start=0,end=arr.length-1;
//         int mid=0;
//         while(start<=end)
//         {
//             mid=start+(end-start)/2;
//             if(arr[mid]==target)
//             {
//                 int maxIdx=0;
//                 if(mid==0)
//                 {
//                     while(arr[mid+1]>arr[mid])
//                     {
//                         maxIdx=mid+1;
//                         mid++;
//                     }
//                     return maxIdx;
//                 }

//                 else if(mid==arr.length-1)
//                 {
//                     while(arr[mid-1]>arr[mid])
//                     {
//                         maxIdx=mid-1;
//                         mid--;
//                     }
//                     return maxIdx;
//                 }

//                 else if(mid!=0 && arr[mid-1]> arr[mid])
//                 {
//                     while(arr[mid-1]>arr[mid])
//                     {
//                         maxIdx=mid-1;
//                         mid--;
//                     }
//                     return maxIdx;
//                 }
//                 else if(mid!=arr.length-1 && arr[mid+1]>arr[mid])
//                 {
//                     while(arr[mid+1]>arr[mid])
//                     {
//                         maxIdx=mid+1;
//                         mid++;
//                     }
//                     return maxIdx;
//                 }
//                 else{
//                     return mid;
//                 }
//             }
//             else if(arr[mid]<target)
//             {
//                 start=mid+1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }
// }