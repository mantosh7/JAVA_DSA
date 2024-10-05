package JAVA_DSA.BINARY_SEARCH_QUES;

public class PeakElement {
    public static void main(String[] args) {
        // int[] nums={2,1};
        int[] nums={-67,-60,78,31,-24,-78,-89,14,-18,39,-4,60,-33,77,48,22,88,-40,-83,25,-55,68,61,-72,-77,8,-11,90,-75,-86,-85,-66,-79,26,30,32,81,27,12,86,23,-41,20,-58,57,10,54,-27,-63,-94};
        int ans=search(nums); 
        if(ans==-1)
        {
            if(nums[0]>nums[nums.length-1])
            {
                ans=0;
            }
            else{
                ans=nums.length-1;
            }

        }       
        // System.out.println(nums[ans]);
        System.out.println(ans);
    }

    static int search(int[] nums)
    {
        int start=0,end=nums.length-1;
        int mid=start+(end-start)/2;
        int maxIdx=0;
        int target=nums[0];
        while(start<=end)
        {
            mid=start+(end-start)/2;

            if(nums[mid]==target)
            {
                if(mid==0)
                {
                    while(mid<nums.length-1)
                    {
                        if(nums[mid+1]>nums[mid])
                        {
                            maxIdx=mid+1;
                        }
                        mid++;
                    }
                    return maxIdx;
                }

                else if(mid==nums.length-1)
                {
                    while(mid>0)
                    {
                        if(nums[mid-1]>nums[mid])
                        {
                            maxIdx=mid-1;
                        }
                        mid--;
                    }
                    return maxIdx;
                }

                else if(nums[mid+1]>target)
                {
                    while(mid<nums.length-1)
                    {
                        if(nums[mid+1]>nums[mid])
                        {
                            maxIdx=mid+1;
                        }
                        mid++;
                    }
                    return maxIdx;
                }
                else{
                    while(mid>0)
                    {
                        if(nums[mid-1]>nums[mid])
                        {
                            maxIdx=mid-1;
                        }
                        mid--;
                    }
                    return maxIdx;
                }
            }
            
            else if(nums[mid]<target)
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
