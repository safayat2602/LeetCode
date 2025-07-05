class Solution {
    static int count = 0;
    public int reversePairs(int[] nums) {
       count=0;
       mergesort(nums,0,nums.length-1);
       return count;
    }
    public static void mergesort(int a[],int low,int high)
    {
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        add(a,low,mid,high);
        merge(a,low,mid,high);
    }
    public static void add(int a[],int low,int mid,int high)
    {
        int right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && (long)a[i] > 2L * a[right]) right++;
            count+=(right-(mid+1));
        }
    }
    public static void merge(int a[],int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high)
        {
                if(a[left]<=a[right])
                {
                    temp.add(a[left]);
                    left++;
                }
                else{
                    temp.add(a[right]);
                    right++;
                }
            
        }
        while(left<=mid)
        {
          temp.add(a[left]);
          left++;
        }
        while(right<=high)
        {
            temp.add(a[right]);
            right++;
        }
       for(int i=low;i<=high;i++)
       {
           a[i]=temp.get(i-low);
       }
    }
}