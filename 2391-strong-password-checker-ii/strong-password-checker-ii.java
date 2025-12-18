class Solution {
    public boolean strongPasswordCheckerII(String password) {
        
        int n = password.length();
        boolean u = false;
        boolean l = false;
        boolean d = false;
        boolean sc = false;

        if(n>=8){
            for(int i =0;i<n;i++){
                char r = password.charAt(i);
                if(i+1 < n && r==password.charAt(i+1)) return false;
                if(Character.isUpperCase(r)) u = true;
                else if(Character.isLowerCase(r)) l = true;
                else if(Character.isDigit(r)) d = true;
                else sc = true;
            }  
        }
        
        return u && l && d && sc;
    }
}