class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0 || s.length()<t.length()) return "";
        HashMap<Character,Integer> mapt=new HashMap<>();
        for(char c: t.toCharArray())
        {
             mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }
        int required= mapt.size();
        int l=0,r=0;
        int create=0;
        int[] ans={-1,0,0};
        HashMap<Character,Integer> substringmap=new HashMap<>();
        while(r<s.length())
        {
            char c=s.charAt(r);
            int count=substringmap.getOrDefault(c,0);
            substringmap.put(c,count+1);
            if(mapt.containsKey(c) && substringmap.get(c).intValue()== mapt.get(c).intValue())
            {
                create++;
            }   
            while(l<=r && required==create)
            {
                c=s.charAt(l);
                if(ans[0]==-1 || ans[0]>= r-l+1 )
                {
                    ans[0]=r-l+1;
                    ans[1]=l;
                    ans[2]=r;
                }
                substringmap.put(c,substringmap.get(c)-1);
            if(mapt.containsKey(c) && substringmap.get(c).intValue()< mapt.get(c).intValue())
            {
                create--;
            }  l++;
            }
            r++;
        }
        if(ans[0]==-1)
          return "";
        return s.substring(ans[1],ans[2]+1);
    }
}