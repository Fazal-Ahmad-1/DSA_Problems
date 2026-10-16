class Solution {
    public int threeSumClosest(int[] a, int target) {
        int l=a.length;
        Arrays.sort(a);
        int diff=999999;
        int min=999999;
        
        for(int k=0;k<l;k++){
            int i=k+1;int j=l-1;
            while(i<j){
                int sum=a[i]+a[j]+a[k];
                if(Math.abs(sum-target)<diff){
                    diff=Math.abs(sum-target);
                    min=sum;
                }
                if(sum<target)
                i++;
                else if(sum>target)
                j--;
                else
                return sum;
            }
        }

        return min;
    }
}