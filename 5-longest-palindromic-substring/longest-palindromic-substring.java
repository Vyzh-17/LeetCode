class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0,maxlen=1;
        for(int i=0;i<n;i++){
            for(int l=i,r=i;l>=0&&r<n;l--,r++){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                if(r-l+1>maxlen){
                    maxlen=r-l+1;
                    start=l;
                }
            }
            for(int l=i,r=i+1;l>=0&&r<n;l--,r++){
                if(s.charAt(l)!=s.charAt(r)){
                    break;
                }
                if(r-l+1>maxlen){
                    maxlen=r-l+1;
                    start=l;
                }
            }
        }
        return s.substring(start,start+maxlen);
    }
}