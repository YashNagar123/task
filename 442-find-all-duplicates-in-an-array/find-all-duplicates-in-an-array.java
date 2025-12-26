class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer>list = new ArrayList<>();

        int i =0;

        while(i < nums.length){
            
            if(nums[i] != nums[nums[i] - 1]){
                swap(nums,i,nums[i] - 1);
            }
            else i++;
        } 

        for( i =0;i<nums.length;i++){
            if(nums[i] != i+1 ) {
                list.add(nums[i]);
            }
        } 

        return list;  
    }
    static void swap(int [] arr , int i , int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}