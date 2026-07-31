class Solution {
    public int distributeCandies(int[] x) {
        Set<Integer> s = new HashSet<>();

        for (var i : x) 
            s.add(i);
        
        var n = x.length / 2;

        if (s.size() >= n) 
            return n;
        else 
            return s.size();
    }
}