import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {

        int s = 1 << n;
        List<Integer> r = new ArrayList<>();

        for (int i = 0; i < s; i++) {
            r.add(i ^ (i >> 1));
        }

        return r;
    }
}
