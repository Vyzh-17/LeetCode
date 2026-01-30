class Solution {
    public int trap(int[] height) {
       int right=0;
       int left=0;
       int n=height.length;
       int rightA[]=new int [n];
       int leftA[]=new int [n];
 
       for(int i=0;i<n;i++){
        if(height[i]>left){
            left=height[i];
        }
        leftA[i]=left;
       }

        for(int i=n-1;i>=0;i--){
            if(height[i]>right){
                right=height[i];
            }
            rightA[i]=right;
        }
        int sum=0;

        for(int i=0;i<n;i++){
            if(rightA[i]>leftA[i]){
                sum=sum+leftA[i]-height[i];
            }
            else{
                sum=sum+rightA[i]-height[i];
            }
        }

        return sum;




    }
}