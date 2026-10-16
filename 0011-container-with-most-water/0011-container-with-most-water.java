class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;int r=n-1;
        int max=-1;
        while(l<r){
            int dis=r-l;
            int h=Math.min(height[l],height[r]);
            max=Math.max(max,dis*h);
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return max;
    }
}