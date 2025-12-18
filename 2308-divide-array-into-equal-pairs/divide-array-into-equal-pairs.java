class Solution {
    public boolean divideArray(int[] nums) {

       int n= nums.length;
       int pair = 0;

        Arrays.sort(nums);

        for(int i =0;i<n-1;){
            if(nums[i] == nums[i+1]){
                pair++;
                i+=2;
            }else return false;
        }

        return true;
        
    }
}