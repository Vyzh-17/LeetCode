class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int r=0,l=0;
        int max=0;
        int c=0;
        for(r=0;r<n;r++){
            if(nums[r]==0){
                c++;
            }
            while(c>0){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}