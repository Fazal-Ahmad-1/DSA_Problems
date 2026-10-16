class Solution {
    public int reverse(int x) {
        int n=1;
        if(x<0)n=-1;
        x=Math.abs(x);
        long rev=0;
        while(x>0){
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE || rev*n<Integer.MIN_VALUE)
        return 0;
        return (int)rev*n;
    }
}