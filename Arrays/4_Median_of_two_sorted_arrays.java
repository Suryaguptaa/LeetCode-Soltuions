class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int merged [] = new int[m+n];

        for(int i =0;i<m;i++){
            merged[i] = nums1[i];
        }

        for(int j =0;j<n;j++){
            merged[m+j]=nums2[j];
        }

        Arrays.sort(merged);

        int l = merged.length;

        if(l%2==0){
            int x = l/2;
            double j = merged[x-1];
            double k = merged[x];
            return (j+k)/2;
        }

        else{
            int y = (l)/2;
            return (merged[y]);
        }

    }
}