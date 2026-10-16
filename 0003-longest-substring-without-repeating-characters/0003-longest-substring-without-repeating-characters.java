class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
        int i=0;int j=0;
        HashSet<Character>set=new HashSet<>();
        int max=0;
        while(i<=j && j<l){
            char curr=s.charAt(j);
            if(set.contains(curr)==false){
                set.add(curr);
                j++;
                max=Math.max(max,j-i);
            }
            else{
                while(s.charAt(i)!=curr)
                {set.remove(s.charAt(i));
                i++;}
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}