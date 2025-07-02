class Solution {
    public int splitArray(int[] arr, int k) {
       int low=0;
       int high=0;
       for(int i:arr)
       {
        low=Math.max(i,low);
        high+=i;
       }
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(Ispossible(arr,mid)>k)
        {
            low=mid+1;
        }
        else{
           high=mid-1;
        }
       }
       return low;
    }
    public static int Ispossible(int arr[],int ans)
    {
        int stu=1;
        int last=0;
        for(int i=0;i<arr.length;i++)
        {
            if(last+arr[i]<=ans)
            {
                last+=arr[i];
            }
            else{
                stu++;
                last=arr[i];
            }
        }
        return stu;
    }
}