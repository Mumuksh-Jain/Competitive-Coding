class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        allsubset(arr,0,res,nums);
        return res;
    }
    private void allsubset(List<Integer> arr ,int i, List<List<Integer>> res,int[] nums)
    {
       if(i==nums.length)
       {
        res.add(new ArrayList<>(arr));
        return;
       }
       arr.add(nums[i]);
       allsubset(arr,i+1,res,nums);
       arr.remove(arr.size() - 1);
       allsubset(arr,i+1,res,nums);
    }
}