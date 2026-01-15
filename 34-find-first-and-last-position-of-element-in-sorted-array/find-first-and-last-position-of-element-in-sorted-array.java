class Solution {
    public int[] searchRange(int[] nums, int target) {

        int st = 0;
        int lt = nums.length-1;
        
        int first = -1;
        int last = -1;

        while(st <= lt){

            int mid = st + (lt - st) /2;

            if(nums[mid] == target) {
                first = mid;
                lt = mid -1;
            }
            else if(nums[mid] > target) lt = mid -1;
            else st = mid + 1;
        }

        st = 0;
        lt = nums.length -1;

        while(st <= lt){

            int mid = st + (lt - st) /2;

            if(nums[mid] == target) {
                last = mid;
                st = mid +1;
            }
            else if(nums[mid] > target) lt = mid -1;
            else st = mid + 1;
        }

        return new int [] {first,  last}; 
    }
}