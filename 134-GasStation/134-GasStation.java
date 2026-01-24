// Last updated: 1/24/2026, 3:27:12 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int  n=gas.length;
        int totalcost=0;
        int remgas=0;
        int ans=0;

        for(int i=0;i<n;i++){
            totalcost+=gas[i] - cost[i];
            remgas +=gas[i] -cost[i];

            if(remgas<0){
                remgas=0;
                ans=i+1;
            }
        }

    return totalcost>=0?ans:-1;
        
    }
}