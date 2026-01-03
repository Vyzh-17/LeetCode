class Solution {
    public int numOfWays(int n) {
        long MOD = 1_000_000_007L;
        long halfA = 6, halfB = 6;
        for (int i = 1; i < n; i++) {
            long halfA2 = halfA * 3 + halfB * 2;
            long halfB2 = halfA2 - halfA;
            halfA = halfA2 % MOD;
            halfB = halfB2 % MOD;
        }
        return (int)((halfA + halfB) % MOD);
    }
}
