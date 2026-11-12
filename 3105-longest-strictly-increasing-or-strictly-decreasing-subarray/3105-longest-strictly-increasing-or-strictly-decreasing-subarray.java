class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int inc=1;
        int dec=1;
        int l=nums.length;
        int c=1;
        for(int i=1;i<l;i++){
            if(nums[i]>nums[i-1])
            {c++;inc=Math.max(inc,c);}
            else
            c=1;
        }
        c=1;
        for(int i=1;i<l;i++){
            if(nums[i]<nums[i-1])
            {c++;dec=Math.max(dec,c);}
            else
            c=1;
        }

        return Math.max(inc,dec);
    }
}