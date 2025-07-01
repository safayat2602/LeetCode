class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        ArrayList<Integer> li=new ArrayList<>();
        int left=0;
        int right=0;
        int n=nums1.length;
        int m=nums2.length;
        while(left<n && right<m)
        {
            if(nums1[left]<nums2[right])
            {
                left++;
            }
            else if(nums1[left]>nums2[right])
            {
                right++;
            }
            else {
                li.add(nums1[left]);
                left++;
                right++;
            }
        }
        int ans[]=new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            ans[i]=li.get(i);
        }
        return ans;
    }
}