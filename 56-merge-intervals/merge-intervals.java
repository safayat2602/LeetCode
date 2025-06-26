class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> li=new ArrayList<>();
        int curr[]=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int next[]=intervals[i];
            if(curr[1]>=next[0])
            {
                curr[1]=Math.max(curr[1],next[1]);
            }
            else {
                li.add(curr);
                curr=next;
            }
        }
        li.add(curr);
        return li.toArray(new int[li.size()][]);
    }
}