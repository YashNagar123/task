class Solution {
    public boolean checkString(String s) {

       int lastA = s.lastIndexOf('a'); 
       int firstB = s.indexOf('b');

       if(lastA<firstB || lastA == -1 || firstB == -1) return true;
       return false;
    }
}