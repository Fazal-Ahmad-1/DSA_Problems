class Solution {
    String invert(String s){
        StringBuilder sb=new StringBuilder("");
        for(char c:s.toCharArray()){
            if(c=='0')
            sb.append("1");
            else
            sb.append("0");
        }
        return sb.toString();
    }
    String reverse(String s){
        StringBuilder sb=new StringBuilder("");
        for(char c:s.toCharArray()){
            sb.append(c);
        }
        return sb.reverse().toString();
    }

    public char findKthBit(int n, int k) {
        String s="0";
        StringBuilder sb=new StringBuilder("0");
        for(int i=1;i<=n;i++){
            sb.append("1"+reverse(invert(sb.toString())));
        }
        return sb.charAt(k-1);
    }
}