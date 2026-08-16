class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int r = m.length;
        int c = m[0].length;
        int x = 0;
        int y = 0;
        int dx = 1;
        int dy = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < r * c; i++) {
            res.add(m[y][x]);
            m[y][x] = -101;

            if (!(0 <= x + dx && x + dx < c && 0 <= y + dy && y + dy < r) || m[y+dy][x+dx] == -101) {
                int t = dx;
                dx = -dy;
                dy = t;
            }

            x += dx;
            y += dy;
        }

        return res;        
    }
}