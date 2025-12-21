class Solution {
    public int majorityElement(int[] nums) {
        
        int ans = nums[0];
        int vote = 1;

        for(int i =1;i<nums.length;i++){

            if(nums[i] == ans) vote++;
            else vote--;

            if(vote == 0) {
                ans = nums[i];
                vote =1;
            }

        }
        return ans;
    }
}