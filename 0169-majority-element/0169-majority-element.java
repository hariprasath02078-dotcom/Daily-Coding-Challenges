class Solution {
    public int majorityElement(int[] a) {
        int b=0;
        int m=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=i;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c>b){
                b=c;
                m=a[i];
            }
        }
        return m;
    }
}