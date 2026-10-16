class Solution {
    public boolean isPalindrome(int n) {
        
        if(n<0)
        return false;
        else
        {
            int cp=n;int rev=0;
            while(cp>0)
            {
                int d=cp%10;
                rev=rev*10+d;
                cp=cp/10;
            }
            if(n==rev)
            return true;
            else
            return false;
        }
    }
}