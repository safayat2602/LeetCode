class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      ArrayList<List<Integer>> ans=new ArrayList<>();
      func(0,candidates,target,ans,new ArrayList<>());
      return ans;
    }
    public static void func(int i,int arr[],int target, ArrayList<List<Integer>> ans,ArrayList<Integer> li)
    {
        if(i==arr.length)
        {
            if(target==0){
                ans.add(new ArrayList<>(li));
            }
        
        return;
        }
        if(arr[i]<=target)
        {
            li.add(arr[i]);
            func(i,arr,target-arr[i],ans,li);
            li.remove(li.size()-1);
        }
        func(i+1,arr,target,ans,li);
    }
}