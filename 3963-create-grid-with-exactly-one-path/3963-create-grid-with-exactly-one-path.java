class Solution {
    public String[] createGrid(int m, int n) {
        String a[]=new String[m];
        StringBuilder sb=new StringBuilder("");
        for(int j=0;j<n;j++){
            sb.append(".");
        }
        a[0]=sb.toString();
        int k=1;
        if(m==1)return a;
        String pre="";
        for(int j=1;j<n;j++)
        pre=pre+"#";
        sb=new StringBuilder("");
        for(int i=1;i<m;i++){
            sb.append(pre+".");
            a[i]=sb.toString();
            sb=new StringBuilder("");
        }
        return a;
    }
}