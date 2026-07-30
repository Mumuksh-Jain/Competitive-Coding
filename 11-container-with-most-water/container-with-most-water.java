class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int area=Integer.MIN_VALUE;
        int maxe=Integer.MIN_VALUE;
        while(left<right)
        {
          int h = Math.min(height[left],height[right]);
          int w= right-left;
          area=h*w;
          maxe=Math.max(area,maxe);
          if (height[right] > height[left])
            left++;
          else
            right--;
        }
        return maxe;
    }

    }
