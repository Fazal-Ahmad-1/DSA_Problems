class Solution {
     HashMap<Character,String> map=new HashMap<>();
    void gen(String digits,int idx,String com,List<String>result){
        if(idx==digits.length())
        {   if(com.length()==digits.length())
            result.add(com);
            return;
        }
        
        String str=map.get(digits.charAt(idx));
        for(int i=0;i<str.length();i++){

            gen(digits,idx+1,com+str.charAt(i),result);
            gen(digits,idx+1,com,result);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0)
       { 
       return result;
       }

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        gen(digits,0,"",result);
        return result;
    }
}