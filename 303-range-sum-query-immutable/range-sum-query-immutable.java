class NumArray {
    public int nums[];
    public NumArray(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        this.nums=arr;

    }
    
    public int sumRange(int left, int right) {
        if(left==0){
           return nums[right];
        }
        return this.nums[right]-this.nums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */