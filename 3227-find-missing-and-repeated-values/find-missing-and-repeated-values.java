class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
       int hasharr[]=new int[n*n+1];
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            hasharr[grid[i][j]]++;
        }
       }
       int repeat=-1;
       int missing=-1;
       for(int i=1;i<hasharr.length;i++)
       {
         if(hasharr[i]>1)
           repeat=i;
         else if(hasharr[i]==0)
           missing=i;
         if(repeat!=-1 && missing!=-1)
           break;
       }
       return new int[]{repeat,missing};
    }
}