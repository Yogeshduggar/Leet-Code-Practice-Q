class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hm.containsKey(temp)){
                int in=hm.get(temp);
                if(i!=in){
                return new int[] {i,in};}
            }
        }
    return new int[] {-1,-1};
    }
}