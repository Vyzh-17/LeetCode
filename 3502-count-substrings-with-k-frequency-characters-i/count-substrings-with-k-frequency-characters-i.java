class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int result = 0, left = 0;

        for (int right = 0; right < n; right++) {
            int c = s.charAt(right) - 'a';
            freq[c]++;
            while (freq[c] >= k) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            result += left;
        }
        return result;
    }
}