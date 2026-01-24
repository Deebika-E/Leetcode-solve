// Last updated: 1/24/2026, 3:26:20 PM
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0;
        for(int i=0;i<points.length -1;i++){
            int x1=points[i][0];
            int y1=points[i][1];

            int x2=points[i+1][0];
            int y2=points[i+1][1];

            int xdiff=Math.abs(x2-x1);
            int ydiff=Math.abs(y2-y1);

            res+=Math.max(xdiff,ydiff);
        }
      return res;  
    }
}