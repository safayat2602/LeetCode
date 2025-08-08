class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        func(0,nums,nums.length,ans,new ArrayList<Integer> ());
        return ans;
    }
    public static void func(int ind,int nums[],int n,List<List<Integer>> ans,List<Integer> li)
    {
        if(ind==n)
        {
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[ind]);
        func(ind+1,nums,n,ans,li);
        li.remove(li.size()-1);
        func(ind+1,nums,n,ans,li);
    }

}