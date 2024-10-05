package JAVA_DSA.BINARY_SEARCH_QUES;
import java.util.*;
public class FirstLastIndex {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target=7;
        int[] ans = answer(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    // for checking target element is present or not. If not then return [-1,-1]
    static int[] answer(int[] nums, int target)
    {
        int start=0, end=nums.length-1, mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                int firstIdx = firstOccurence( nums, target);
                int lastIdx = lastOccurence( nums,target);
                return new int[] {firstIdx,lastIdx};
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    // for finding first index (using floor concept)
    static int firstOccurence(int[] nums,int target)
    {
        int start=0, end=nums.length-1, mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]>=target)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end+1;
    }

    // for finding last index (using ceiling concept)
    static int lastOccurence(int[] nums,int target)
    {
        int start=0, end=nums.length-1, mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]<=target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start-1;
    }
}

