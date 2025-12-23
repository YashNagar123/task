class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer>list = new ArrayList<>();

        int n = nums.length ;

        int i =0;
        
        while(i<n){

            if(nums[i] == nums[nums[i] - 1]) i++; // agar elements are equal then skip
            else if( nums[i] -1 != i) {// element not at correct position then skip
                int t = nums[i];
                nums[i] = nums[t - 1];
                nums[t - 1] = t;
            } else i++;
        }

        for(int j =0;j<n;j++){// check the elements and add
            if(nums[j] != j + 1) list.add(j+1);
        }

        return list;
    }
}