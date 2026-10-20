class Solution {
public:
    bool isPalindrome(string s) {
       string fil;
       for(char c:s)
       {
        if(isalnum(c))
        fil+=tolower(c);
       }
       int left=0;
       int right=fil.size()-1;
       while(left<right)
       {
        if(fil[left]!=fil[right])return false;
        left++;right--;
       }
       return true;
    }
};