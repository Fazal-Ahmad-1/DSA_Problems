import java.util.*;
class Solution {
    public String longestPrefix(String s) {
        int l=s.length();
        int len=0;
        String ans="";
        for(int i=0;i<l;i++){
            String p=s.substring(0,i);
            if(s.endsWith(p)){
                if(i+1>len){
                    len=i+1;
                    ans=p;
                }
            }
        }
        return ans;
    }
}