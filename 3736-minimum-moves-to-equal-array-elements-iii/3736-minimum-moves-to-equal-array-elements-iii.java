class Solution {
    public int minMoves(int[] nums) {
        int l=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            max=Math.max(max,nums[i]);
        }
        int moves=0;
        for(int val:nums){
            moves+=max-val;
        }
        return moves;
    }
}