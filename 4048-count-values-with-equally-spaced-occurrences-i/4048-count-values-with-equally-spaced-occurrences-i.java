class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        int ans = 0;

        for (List<Integer> idx : map.values()) {
            if (idx.size() == 3 && idx.get(0) + idx.get(2) == 2 * idx.get(1)) ans++;
        }

        return ans;
    }
}