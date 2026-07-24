class Solution {
    public String toHex(int n) {
        char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        if (n == 0) return "0";
        if (n > 0 && n <= 15) return Character.toString(h[n]);

        long a = n;  // handle negative values
        if (a < 0) a += (1L << 32);
        
        StringBuilder result = new StringBuilder();
        
        while (a > 0) {
            result.insert(0, h[(int)(a % 16)]);
            a /= 16;
        }
        
        return result.toString();
    }
}