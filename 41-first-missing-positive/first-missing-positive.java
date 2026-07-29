class Solution {
    public int firstMissingPositive(int[] nums) {
        int contains=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           if(nums[i]==1)
             contains++;
        }
        if(contains==0)
     {
       return 1;
     }
  
        int temp;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=0 || nums[i]>n)
              nums[i]=1;
        }
        for(int i=0;i<n;i++)
        {
           temp = Math.abs(nums[i]) - 1;
              nums[temp] = -Math.abs(nums[temp]);
            
        }
         for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
               return i+1;
            }
        }
        return n+1;
    }
}