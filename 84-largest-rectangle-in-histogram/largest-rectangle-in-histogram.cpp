class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n= heights.size();
        stack<int> st ;
        int maxe=0;
        int area;
        int  left[n];
       int right[n];
        for(int i=0;i<n;i++)
        {
          
            while(!st.empty() && heights[i]<=heights[st.top()])
            {
                st.pop();
            } 
              if(st.empty())
             {
               
                left[i]=-1; 
             }
             else
             {
                left[i]=st.top();
             }
             st.push(i);
        }
        while(!st.empty()) st.pop();
        for(int i=n-1;i>=0;i--)
        {
          
            while(!st.empty() && heights[i]<=heights[st.top()])
            {
                st.pop();
            } 
              if(st.empty())
             {
                  right[i]=n;
                
             }
             else
             {
                right[i]=st.top();
             }
             st.push(i);
        }
        for(int i=0;i<n;i++)
        {
           area=heights[i]*(right[i]-left[i]-1);
           maxe=max(area,maxe);
        }
        return maxe;
    }
};