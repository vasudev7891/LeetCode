class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int water = 0;

        int maxLeft[] = new int[size], maxRight[] = new int[size];

        maxLeft[0] = height[0];
        maxRight[size - 1] = height[size - 1];

        for(int i = 1; i < size; i++){
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }

        for(int i = size - 2; i >= 0; i--){
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }

        for(int i = 0; i < size; i++){
            water += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        
        return water;
    }
}