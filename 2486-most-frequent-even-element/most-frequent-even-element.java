import java.lang.*;
class Solution {
    public int mostFrequentEven(int[] nums) {
        

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int max = -1;
        int ans = -1;


        for(int k : map.keySet()){
            if(map.get(k) > max && k % 2 == 0){
                    max = map.get(k);
                    ans = k;
            }else if(map.get(k) == max  && k % 2 == 0){ 
                ans = Math.min(ans , k);
            }
        }

        return ans;
    }
}