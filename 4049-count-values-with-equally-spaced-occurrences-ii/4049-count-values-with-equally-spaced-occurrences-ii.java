class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        int ans = 0;

        for (List<Integer> idx : map.values()) {
            int size = idx.size();
            if(size < 3) continue;

            int j = 0;
            int diff = idx.get(1) - idx.get(0);
            for(j = 2; j < size; j++) {
                if(idx.get(j) - idx.get(j - 1) != diff) break;
            }

            if(j == size) ans++;
        }    

        return ans;
    }
}