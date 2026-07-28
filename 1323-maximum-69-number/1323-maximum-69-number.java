class Solution {
    public int maximum69Number(int a) {
  char[] d = String.valueOf(a).toCharArray();  
        for (int i = 0; i < d.length; i++) {
            if (d[i] == '6') {
                d[i] = '9';
                break; 
            }
        }
        return Integer.parseInt(new String(d));
    }
}