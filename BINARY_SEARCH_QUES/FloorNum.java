package JAVA_DSA.BINARY_SEARCH_QUES;

public class FloorNum {
    public static void main(String[] args) {
        int[] arr = {-4,-1,2,3,5,9,14,16,18,36};
        int target = 10;
        int ans = binarySearch(arr,target);
        System.out.println(arr[ans]);
    }

    static int binarySearch(int[] arr,int target)
    {
        int start=0,end=arr.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return end;
    }
}
