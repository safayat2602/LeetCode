class Solution {
    public int[] findPeakGrid(int[][] mat) {
      int n=mat.length;
      int m=mat[0].length;
      int low=0;
      int high=m-1;
      while(low<=high)
      {
        int mid=(low+high)/2;
        int ans=getMax(mat,mid);
        int left=mid-1>=0 ? mat[ans][mid-1] : -1;
        int right=mid+1<m ? mat[ans][mid+1] : -1;
        if(left<mat[ans][mid] && right<mat[ans][mid])
        {
            return new int[]{ans,mid};
        }
        else if(left>mat[ans][mid])
        {
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return new int[]{-1,-1};
    }
    public static int getMax(int mat[][],int mid)
    {
        int max=-1;
        int ind=-1;
        for(int i=0;i<mat.length;i++)
        {
          if(max<mat[i][mid])
          {
            max=mat[i][mid];
            ind=i;
          }
        }
        return ind;
    }
}