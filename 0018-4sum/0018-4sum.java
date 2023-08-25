class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums.length < 4) {
            return ans;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i <= n - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j <= n - 3; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1;
                int h = n - 1;
                while (l < h) {
                    long sum = nums[i]; 
                    sum+= nums[j];
                    sum+= nums[l];
                    sum+= nums[h];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[h]));
                        while (l < h && nums[l] == nums[l + 1]) l++;
                        while (l < h && nums[h] == nums[h - 1]) h--;
                        l++;
                        h--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        h--;
                    }
                }
            }
        }
        return ans;
    }
}
