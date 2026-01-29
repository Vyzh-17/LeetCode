class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int ans=(int)1e9;
        int r=0;
        int l=0;
        int n=arr.length;
        int sum=0;
        for(r=0;r<n;r++){
            sum=sum+arr[r];
            while(sum>=target){
                ans=Math.min(ans,r-l+1);
                sum=sum-arr[l];
                l++;
            }
        }
        if(ans==(int)1e9){
            return 0;
        }
        return ans;
    }
}