class Solution {
    public int numOfWays(int n) {

        int MOD = 1000000007;

        long x = 6; 
        long y = 6; 

        for (int i = 1; i < n; i++) {
            long nx = (2 * x + 2 * y) % MOD;
            long ny = (2 * x + 3 * y) % MOD;

            x = nx;
            y = ny;
        }

        return (int)((x + y) % MOD);
    }
}
