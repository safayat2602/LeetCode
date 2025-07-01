class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low=0;
      int high=0;
      int ans=Integer.MAX_VALUE;
      for(int i:piles)
      {
        high=Math.max(high,i);
      }
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(valid(piles,mid)<=h)
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
    public static int valid(int piles[],int num)
    {
       int total=0;
       for(int i:piles)
       {
        total+=Math.ceil((double)(i)/(double)(num));
       }
       return total;
    }

}