class Solution {
    public int minimumOperations(int[] nums) {

        int c =0;
        int n = nums.length;
       Arrays.sort(nums);
       for(int i =0;i< n;i++){
            int temp = nums[i];
            if(nums[i] != 0){
             for(int j = i; j<n;j++){
               nums[j] = nums[j] - temp;
             }
             c++;
            }
       }
       return c;
    }
}