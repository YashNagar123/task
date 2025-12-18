class Solution {
    public int percentageLetter(String s, char letter) {
        
        int c =0;
        for(char ch : s.toCharArray()){
            if(ch == letter) c++;
        }
        return ((c*100)/s.length());
    }
}