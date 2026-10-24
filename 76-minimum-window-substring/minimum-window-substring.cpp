class Solution {
public:
    string minWindow(string s, string t) {
    int n=s.length();
    if(t.length()>n) return "";
     unordered_map<char,int> mp;
     for(char &c:t)
     {
        mp[c]++;
     }
    int reqCount=t.length();
    int i=0,j=0,start_i=0;
    int winSize=INT_MAX;
    while(j<n)
    {
        char ch=s[j];
        if(mp[ch]>0)reqCount--;
        mp[ch]--;
        while(reqCount==0)
        {
            int currSize=j-i+1;
            if(winSize>currSize)
            {
                winSize=currSize;
                start_i=i;
            }
            mp[s[i]]++;
            if(mp[s[i]]>0)reqCount++;
            i++;
        }
        j++;
    }

     return winSize==INT_MAX?"":s.substr(start_i,winSize);

    }
};