class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[256];
        int n=s.length();
        int l=0,r=0;
        int max=0;
        for(r=0;r<n;r++){
            freq[s.charAt(r)]++;
            while(freq[s.charAt(r)]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}