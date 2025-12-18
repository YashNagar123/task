class Solution {
    public int countHillValley(int[] nums) {
        
        int c= 0;
        int n = nums.length;
        int p =nums[0];

        for(int i =1 ; i<n-1 ; i++){
            if((p > nums[i] && nums[i] < nums[i+1]) || 
            (p < nums[i] && nums[i] > nums[i+1])){
                c++;
                p = nums[i];
            }
        }
        System.out.println(p);

        return c;

    }
}