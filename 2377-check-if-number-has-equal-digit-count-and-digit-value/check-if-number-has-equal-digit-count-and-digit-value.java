class Solution {
    public boolean digitCount(String num) {

        int [] f = new int [10];

        for(char ch : num.toCharArray()){
         f[ch-'0']++;
        } 

        for(int i =0;i<num.length();i++){
            if( num.charAt(i) - '0' != f[i])  return false;
        }

        return true;
    }
}