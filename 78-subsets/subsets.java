class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, nums, new ArrayList<Integer>(), 0);
        return ans;
    }

    public void helper(List<List<Integer>> ans, int[] nums, List<Integer> sub, int index) {
        ans.add(new ArrayList<Integer>(sub));
        for (int i = index; i < nums.length; i++) {
            sub.add(nums[i]);
            helper(ans, nums, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }
}