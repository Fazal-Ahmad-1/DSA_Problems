class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int l=j+1;int r=n-1;
                while(l<r){
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];

                    if(sum==target){
                        List<Integer>list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        ans.add(new ArrayList<>(list));
                        l++;
                        r--;
                    while(l<r && nums[l]==nums[l-1])l++;
                    while(l<r && nums[r]==nums[r+1])r--;
                    }
                    else if(sum<target)
                    l++;
                    else
                    r--;

                }

            }
            
        }
        return ans;
    }
}