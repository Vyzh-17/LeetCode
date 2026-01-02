class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int freq[]=new int[100000];
        int b=0;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]==n){
             b= nums[i];
            }
        }
       return b;
    }
  
}