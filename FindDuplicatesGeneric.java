class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i]);
            int target = nums[val-1];
            if (target < 0) ans.add(val);
            nums[val-1] = -target;
        }
        return ans;
    }
}
