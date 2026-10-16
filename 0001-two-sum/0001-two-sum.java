class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int s=target-nums[i];
            if(map.containsKey(s) && map.get(s)!=i){
                a[0]=i;
                a[1]=map.get(s);
                break;
            }
        }
        return a;
    }
}