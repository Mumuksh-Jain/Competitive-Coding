class Solution {
public:
    int maxSubArray(vector<int>& nums) {
       int be=nums[0];
       int sum=nums[0];
       int n=nums.size();
       for(int i=1;i<n;i++)
       {
         int a=be+nums[i];
         int b=nums[i];
         be=max(a,b);
         sum=max(sum,be);
       } 
       return sum;
    }
};