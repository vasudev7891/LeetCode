class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int min = nums1[0];

        int evenOdd = min % 2;

        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] % 2 == evenOdd) continue;
            
            boolean flag = false;

            for(int j = 0; j < i; j++) {
                int diff = nums1[i] - nums1[j];
                
                if((diff >= 1) && (diff % 2) == evenOdd ) {
                    flag = true;
                    break;
                }
            }

            if(!flag) return false;
        }

        return true;
    }
}