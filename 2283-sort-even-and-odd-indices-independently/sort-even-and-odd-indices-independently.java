import java.util.Arrays;
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        int n = nums.length;
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%2 ==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }


        Collections.sort(even);// sort even elements in ascending order
        Collections.sort(odd,Collections.reverseOrder());// sort odd elements in descending order

        int s= 0;
        int e =0;
        int [] ans = new int[n];

        for(int i =0;i<n;i++){
            if(i%2 ==0) ans[i] = even.get(s++);
            else ans[i] = odd.get(e++);
        }
        return ans;
    }
}