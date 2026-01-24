class Solution {

    public void set(int[] nums, int index, List<Integer> curr, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(curr);
            return;
        }

    
        List<Integer> include = new ArrayList<>(curr);
        include.add(nums[index]);
        set(nums, index + 1, include, res);

     
        set(nums, index + 1, new ArrayList<>(curr), res);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        set(nums, 0, new ArrayList<>(), res);
        return res;
    }
}
