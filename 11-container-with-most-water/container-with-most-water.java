class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int st =0;
        int lt = n-1;
        int maxArea = 0;

        while(st < lt){

            //maxArea = length * width;
            // length -> differnce of height of current lines i.e. 
            // (differenc of index of current lines)
            // width -> minimum height among the current lines

            maxArea = Math.max(maxArea , (lt-st) * Math.min(height[st],height[lt]));

            // update width -> jo line ki height kam , usse update

            if(height[st] < height[lt]) st++;
            else lt--;
        }
        return maxArea;
    }
}