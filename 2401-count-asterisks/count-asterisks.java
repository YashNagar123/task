class Solution {
    public int countAsterisks(String s) {

        int b =0;
        int st= 0;

        for(char ch : s.toCharArray()){
            if(ch == '|') b++;
            if(ch == '*' && b %2 == 0 ) st++;
        }
        
        return st; 
    }
}