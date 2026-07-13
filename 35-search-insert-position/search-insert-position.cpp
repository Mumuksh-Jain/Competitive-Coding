class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int s=0;
        int n=nums.size();
        int e =n;
        while(s<e)
        {
         int mid=s+(e-s)/2;
         if(target>nums[mid]) s=mid+1;
         else if (target<nums[mid])e=mid;
         else return mid;
        }
        return s;
        
        
    }
};