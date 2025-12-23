class Solution {
    public int missingNumber(int[] nums) {

      int n = nums.length;

      int i =0;

      while(i<n){

        if(nums[i] == i || nums[i] == n) i++;
        else{
            int t = nums[i];
            nums[i] = nums[t];
            nums[t] = t;
        }
      }

      for(int j =0;j<n;j++){
        if(j != nums[j]) return j;
      }
      return n;
    }
}