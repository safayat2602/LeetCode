class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int low=1;
       int high=0;
       int ans=-1;
       for(int i:nums)
       {
        high=Math.max(i,high);
       }
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(isValid(nums,mid)<=threshold)
        {
          ans=mid;
          high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
    public static int isValid(int nums[],int div)
    {
        int ans=0;
        for(int i:nums)
        {
          ans+=Math.ceil((double)i/(double)div);
        }
        return ans;
    }
}