class Solution {
    public boolean isPerfectSquare(int num) {
        
        int s = 0;
        int l = num;
        double n = (double) num;
        boolean isps = false;

        while(s <= l){
            double m = s+(l-s)/2;

            if( m == n/m ){
                isps = true;
                break;
            }else if(m < n/m) s = (int)m+1;
            else l = (int)m-1;
        }

        return isps;
    }
}