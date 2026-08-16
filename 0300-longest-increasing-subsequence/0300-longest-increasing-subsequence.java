import java.util.*;

class Solution {
    public int lengthOfLIS(int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }

        int n = a.length;
        int[] d = new int[n];

        Arrays.fill(d, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (a[i] > a[j]) {
                    d[i] = Math.max(d[i], d[j] + 1);
                }
            }
        }

        int max = Arrays.stream(d).max().orElse(0);

        return max;
    }
}