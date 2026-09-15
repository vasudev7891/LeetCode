class Solution {
    public int numberOfPairs(int[][] points) {
        int ans = 0;

        for(int i = 0; i < points.length; i++) {
            for(int j = 0; j < points.length; j++) {

                if(i == j) continue;

                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];

                boolean flag = true;

                if(x1 <= x2 && y1 >= y2) {
                    for(int k = 0; k < points.length; k++) {
                        
                        if(k == i || k == j) continue;
                        int x3 = points[k][0], y3 = points[k][1];
                    
                        if(x3 <= x2 && x3 >= x1 && y3 >= y2 && y3 <= y1) flag = false;
                        if(!flag) break;
                    }
                } else flag = false;

                if(flag) ans++;
            }
        }

        return ans;
    }
}