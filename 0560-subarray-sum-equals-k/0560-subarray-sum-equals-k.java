class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> ps=new HashMap<Integer,Integer>();
       int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                ans++;
            }
            if(ps.containsKey(sum-k)){
                ans+=ps.get(sum-k);
            }
        if(ps.containsKey(sum)){
            ps.put(sum,ps.get(sum)+1);
        }
        else{
            ps.put(sum,1);
        }

        }
        return ans;
    }
}