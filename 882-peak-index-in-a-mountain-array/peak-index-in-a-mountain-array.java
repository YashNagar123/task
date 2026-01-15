class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;

            // Peak is on right side
            if(arr[mid] < arr[mid + 1]) start = mid + 1;

            // Peak is at mid or on the left side
            else end = mid;

        }

        // loop will end when start == end,
        // hence only one element is left in the array,
        // which is the peek element

        return start;
    }
}