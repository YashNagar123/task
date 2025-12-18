class Solution {
    public int findFinalValue(int[] nums, int original) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == original){
                original *= 2;
                i = -1;// we update zero so that , next time the loop again start from 0(-1+1=0)
            } 
        }

        return original;
    }
}