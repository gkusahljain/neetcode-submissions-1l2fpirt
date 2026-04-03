class Solution {
    public int maxArea(int[] heights) {
        int maxwater=0;
        int left=0;
        int right=heights.length-1;

        while(left<right){
            int width= right-left;
            int hgt=Math.min(heights[left],heights[right]);
            int ans=width*hgt;

            maxwater=Math.max(maxwater,ans);

            if(heights[left]<heights[right])
               left++;
            else 
              right--;

        }
        return maxwater;
    }
}
