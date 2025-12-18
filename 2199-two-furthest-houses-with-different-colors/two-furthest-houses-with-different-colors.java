class Solution {
    public int maxDistance(int[] colors) {
        
        int n= colors.length;
        int d = 0;

        for (int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                int current = 0;
                if(colors[i] != colors[j]){
                    current  = Math.abs(i-j);
                    d= Math.max(d,current);
                }
            }
        }

        return d;
    }
}