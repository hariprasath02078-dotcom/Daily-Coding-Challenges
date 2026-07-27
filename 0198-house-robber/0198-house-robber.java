class Solution {
    public int rob(int[] a) {
        int n = a.length;

        if (n == 1) {
            return a[0];
        }

        int[] b = new int[n];

        b[0] = a[0];
        b[1] = Math.max(a[0], a[1]);

        for (int i = 2; i < n; i++) {
            b[i] = Math.max(b[i - 1], a[i] + b[i - 2]);
        }

        return b[n - 1];        
    }
}