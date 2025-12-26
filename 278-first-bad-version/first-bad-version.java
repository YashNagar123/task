/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      
      int s =1;
      int l = n;
      int ans = -1;

      while(s < l){

        int m = s+(l-s)/2;

        if(isBadVersion(m)) l = m ; // reduce the length (versions which are already bad)
        else s = m + 1;
      }

      return s; // or l
    }
}