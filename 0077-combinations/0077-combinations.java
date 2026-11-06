class Solution {
    List<List<Integer>>result;
    public void solve(int n,int k,int i,int e,List<Integer>list){
        if(i==k){
            result.add(new ArrayList<>(list));
            return;
        }
        if(i>k || e>n)
        return ;
        //take
        list.add(e);
        solve(n,k,i+1,e+1,list);
        //skip
        list.remove(list.size()-1);
        solve(n,k,i,e+1,list);
    }
    public List<List<Integer>> combine(int n, int k) {
        result=new ArrayList<>();
        solve(n,k,0,1,new ArrayList<>());
        return result;
    }
}