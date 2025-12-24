class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int a =0;
        if(x < 0){
            return false;
        }else{
            while( x != 0){
            int last = x%10;
            a = a*10+last;
            x/=10;
        }}

        if(a== temp) return true;
        return false;

    }
}