class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int s = 0;
        int l = nums.length - 1;
        int ans = -1;

        while(s <= l){

            int m = s+(l-s)/2;

            if(nums[m] == target) {
                ans = m;
                break;
            }else if(nums[m] > target) l = m-1;
            else s = m+1;
        }

        if(ans == -1){
            ans = l+1; // l == s and target must be on l+1 or s+1
        }

        return ans;
    }
}