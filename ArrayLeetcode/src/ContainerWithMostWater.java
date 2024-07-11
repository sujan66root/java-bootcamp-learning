// Leetcode 11 Container with most water
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(findMaximumArea(heights));
    }
    public static int findMaximumArea(int[] heights){
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;
        while(left<right){
            int height = Math.min(heights[left], heights[right]);
            int length = right - left;
            int currentArea = length * height;
            maxArea = Math.max(currentArea, maxArea);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
