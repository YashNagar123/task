class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;

        int i = 0;

        while(i < n){
            if(nums[i] > 0 && nums[i] <= n && nums[i] != i+1 && nums[i] != nums[nums[i] - 1]) swap(nums , i , nums[i] - 1);
            else i++;
        }

        for(i =0;i<n;i++){
            if(i+1 != nums[i]) return i+1;
        }
        return i+1;
    }

    static void swap(int [] arr, int i,int j){

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}