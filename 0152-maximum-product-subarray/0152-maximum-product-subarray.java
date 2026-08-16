class Solution {
    public int maxProduct(int[] a) {

        int n = a.length;
        int l = 1, r = 1;
        int ans = a[0];

        for (int i = 0; i < n; i++) {

            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;

            l = l * a[i];
            r = r * a[n - 1 - i];

            ans = Math.max(ans, Math.max(l, r));
        }

        return ans;
    }
}