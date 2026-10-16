class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int s=0;
        int e=n;
        sort(nums.begin(),nums.end());
        while(s<e)
        {
            int mid=s+((e-s)/2);
            if(nums[mid]>mid)
             e=mid;
            else 
             s=mid+1;
        }
        return s;
    }
};