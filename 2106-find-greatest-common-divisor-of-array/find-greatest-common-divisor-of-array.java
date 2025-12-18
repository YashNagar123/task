class Solution {
    public static int gcd(int a,int b){
       int minimum = Math.min(a,b);

       while(a%minimum != 0 || b%minimum != 0){
        minimum--;
       }

       return minimum;
    }
    public int findGCD(int[] nums) {
        
        int d =1;// divisor of all numbers
        int max = nums[0];
        int min = nums[0];
        
        for(int i =0;i<nums.length;i++){// finding min and max element of nums[]
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        // for(int i = 1;i<= max;i++){
        //     if(max % i == 0 && min % i == 0){
        //             d = Math.max(d,i);
        //     }
        // }
        
        // return d;

      return gcd(min,max);
        
    }
}