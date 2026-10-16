class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs.length;
        String min=strs[0];
        for(int i=0;i<l;i++){
            if(strs[i].length()<min.length()){
                min=strs[i];
            }
        }
        String ans="";
        String p="";
        for(int i=0;i<min.length();i++){
            p=min.substring(0,i+1);
            int f=0;
            for(int j=0;j<l;j++){
                if(strs[j].indexOf(p)!=0)
                {f=1;
                break;}
            }
            if(f==0)
            ans=p;
        }
        return ans;
    }
}