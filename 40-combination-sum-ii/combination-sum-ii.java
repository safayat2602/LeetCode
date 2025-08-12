class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(candidates);
    func(0,candidates,target,ans,new ArrayList<>());
    return ans;
    }
    public static void func(int ind,int arr[],int target,List<List<Integer>> ans,List<Integer> li)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            

            li.add(arr[i]);
            func(i+1,arr,target-arr[i],ans,li);
            li.remove(li.size()-1);
        }
    }

}