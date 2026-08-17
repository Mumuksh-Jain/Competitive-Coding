class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int a = best+nums[i];
            int b=nums[i];
            best=Math.max(a,b);
            ans=Math.max(ans,best);
        }
        return ans;
    }
}