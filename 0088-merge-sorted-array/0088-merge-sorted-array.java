class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1;int b=n-1;
        int ln=m+n-1;
        while(a>=0&&b>=0){
            if(nums1[a]>nums2[b]){
                nums1[ln]=nums1[a];
                a--;ln--;
            }
            else{
                nums1[ln]=nums2[b];
                b--;ln--;
            }
        }
        while(a>=0){
            nums1[ln--]=nums1[a--];
        }
        while(b>=0){
            nums1[ln--]=nums2[b--];
        }
    }
}