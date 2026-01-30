class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int sub = 0;

       
        for (int l = 0; l < n; l++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int r = l; r < n; r++) {
                int idx = s.charAt(r) - 'a';
                freq[idx]++;
                maxFreq = Math.max(maxFreq, freq[idx]);

               
                if (maxFreq >= k) {
                    sub++;
                }
            }
        }
        return sub;
    }
}