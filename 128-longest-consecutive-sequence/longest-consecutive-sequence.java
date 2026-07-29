class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
       HashSet <Integer> numset= new HashSet<>();
        for(int num:nums)
        {
            numset.add(num);
        }
        int ls=1;
        for(int num:numset)
        {
            if(numset.contains(num-1))
            {
                continue; 
            }
            else
            {
                int currentNum= num;
                int cs=1;
                while(numset.contains(currentNum+1))
                 { currentNum++; 
                  cs++;}
            
            ls=Math.max(ls,cs);
            }      
        } 
              return ls;
}
}