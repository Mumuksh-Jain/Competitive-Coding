class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int result=0;
        unordered_map<int,int> mp;
        mp.insert({0,1});
        int cs=0;
        for(int i=0;i<nums.size();i++)
        {
            cs+=nums[i];
            if(mp.find(cs-k)!=mp.end())
               result+=mp[cs-k];
            mp[cs]++;
        }
        return result;
    }
};