import java.math.*;
class Solution {
    public int myAtoi(String s) {
        s.replace("\\s","");
        s=s.trim();

        String num="";
        int sign=1;
        int d=0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='+' && i==0)
               { sign=1; i++;}
             else if(s.charAt(i)=='-' && i==0)
               { sign=-1;i++;}   
            if(i!=s.length())
            if(Character.isDigit(s.charAt(i))){
               num=num+s.charAt(i);
            }

            else
            break;

/*
            if(Character.isDigit(s.charAt(i)))
            break;
            else
            {
                if(s.charAt(i)=='+' && )
                sign=1;
                else if(s.charAt(i)=='-')
                sign=-1;
                else
                {
                num=num+s.charAt(i);
                }
            }*/
        }
        if(num.length()==0)
        return 0;
        BigInteger max=new BigInteger(Integer.MAX_VALUE+"");
        BigInteger min=new BigInteger(Integer.MIN_VALUE+"");
          BigInteger n=new BigInteger(num);
          n=n.multiply(BigInteger.valueOf(sign));
          if(n.compareTo(max)>0)
          return Integer.MAX_VALUE;
          else if(n.compareTo(min)<0)
          return Integer.MIN_VALUE;
          else
          { 
            String str=n+"";
            return Integer.valueOf(str);
          }     
        
    }
}