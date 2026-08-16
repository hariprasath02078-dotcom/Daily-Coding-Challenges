import java.util.*;

class Solution {
    public int[][] merge(int[][] a) {

        Arrays.sort(a, (x, y) -> x[0] - y[0]);

        List<int[]> r = new ArrayList<>();

        for (int[] x : a) {

            if (r.isEmpty() || r.get(r.size() - 1)[1] < x[0]) {
                r.add(x);
            } 
            else {
                r.get(r.size() - 1)[1] =
                    Math.max(r.get(r.size() - 1)[1], x[1]);
            }
        }

        return r.toArray(new int[r.size()][]);
    }
}