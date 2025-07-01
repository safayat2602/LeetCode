class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int low=-1;
      int ans=0;
      int high=0;
      for(int i:weights)
      {
        low=Math.max(low,i);
        high+=i;
      }
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(IsValid(weights,mid)<=days)
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
    public static int IsValid(int weights[],int capacity)
    {
        int day=1;
        int load=0;
        for(int i:weights)
        {
            if(load+i>capacity)
            {
                day++;
                load=i;
            }
            else{
                load+=i;
            }
        }
        return day;
    }
}