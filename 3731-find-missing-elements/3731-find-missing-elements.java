class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }  

        if(max - min + 1 == nums.length) return new ArrayList<>();
        
        List<Integer> ans = new ArrayList<>();
        int[] map = new int[max - min + 1];

        for(int i = 0; i < nums.length; i++) {
            map[nums[i] - min]++;
        }
        
        for(int i = 0; i < map.length; i++) {
            if(map[i] == 0) ans.add(i + min);
        }

        return ans;
    }
}