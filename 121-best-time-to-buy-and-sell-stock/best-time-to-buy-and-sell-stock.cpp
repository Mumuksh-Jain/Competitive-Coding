class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int maxprice=prices[n-1];
        int maxprofit=0;
        for(int i=n-2;i>=0;i--)
        {
            maxprice=max(maxprice,prices[i]);
            maxprofit=max(maxprofit,maxprice-prices[i]);
        }
        return maxprofit;
    }
};