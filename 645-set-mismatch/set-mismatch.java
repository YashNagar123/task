class Solution {
    public int[] findErrorNums(int[] nums) {

       int [] arr = new int[2];

       int i =0;

       while(i< nums.length){

        if(nums[i] != nums[nums[i] -1]) swap(nums,i,nums[i]-1);
        else i++;
       } 

       for( i= 0;i<nums.length;i++){
        if(nums[i] != i+1) {
            arr[0] = nums[i];
            arr[1] = i+1;
        }
       }

       return arr;
    }

    static void swap(int [] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}