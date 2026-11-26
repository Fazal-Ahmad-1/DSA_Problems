class Solution {
    public boolean canAliceWin(int n) {
        int i=0;
        int k=10;
        while(true){
            if(i%2==0){
                n=n-k;
                if(n<0)
                return false;
            }
            else{
                n=n-k;
                if(n<0)
                return true;
            }
            k--;
            i++;
        }
       // return true;
    }
}