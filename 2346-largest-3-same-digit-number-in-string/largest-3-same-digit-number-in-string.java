class Solution {
    public String largestGoodInteger(String num) {
        
        int n = num.length();

        String s ="";

        for(int i =0;i<n-2;i++){
           String c ="";
            if((num.charAt(i) == num.charAt(i+1)) && (num.charAt(i) == num.charAt(i+2))){
                c = num.substring(i,i+3);
                if (s.equals("") || c.compareTo(s) > 0) {
                    s = c;
                }
            }
        }

        return s;
    }
}