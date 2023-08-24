class Solution {
    public int[] searchRange(int[] arr, int x) {
        int n=arr.length;      
        int l=0;int r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==x){
                int left=mid;
                int right=mid;
                while(left>=0 && arr[left]==x){
                    left--;
                }
                while(right<n && arr[right]==x){
                    right++;
                }
                return new int[]{left+1,right-1};
            }
            else if(arr[mid]<x){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }

        return new int[]{-1,-1};
    }
}