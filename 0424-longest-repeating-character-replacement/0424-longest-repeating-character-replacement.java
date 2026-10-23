class Solution {
    public int characterReplacement(String s, int k) {
        int l=s.length();
        int left=0;
        int maxFreq=0;
        int ans=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<l;right++){
            char curr=s.charAt(right);
            map.put(curr,map.getOrDefault(curr,0)+1);
            maxFreq=Math.max(maxFreq,map.get(curr));
            while((right-left+1)-maxFreq>k){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}