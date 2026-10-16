class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;int j=0;
        int m=nums1.length;
        int n=nums2.length;
        int merg[]=new int[m+n];
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j])
            {
                merg[k++]=nums1[i++];
            }
            else
            {
                merg[k++]=nums2[j++];
            }
        }
        while(i<m)
        {
          merg[k++]=nums1[i++];
        }
        while(j<n)
        {
            merg[k++]=nums2[j++];
        }
        double med;
        if(merg.length%2!=0)
        {
            med=merg[((merg.length+1)/2)-1];
        }
        else
        {
            med=(merg[(merg.length/2)-1]+merg[merg.length/2])/2.0;
        }
        return med;
    }
}