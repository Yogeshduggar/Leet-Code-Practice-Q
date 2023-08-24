class Solution {
    public int search(int[] nums, int target) {
       if(nums.length==1 && nums[0]==target){
           return 0;
       }
        int s=0;
        int e=nums.length-1;

        while(s<e){
            int mid=(s+e)/2;
            System.out.println(mid);
            if(nums[s]==target){
                return s;
            }
            else if(nums[e]==target){
                return e;
            }
            else if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
        }
        return -1;
    }
}