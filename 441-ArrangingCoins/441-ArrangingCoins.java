// Last updated: 1/24/2026, 3:26:43 PM
class Solution {
    public int arrangeCoins(int n) {
        int row=0;


        while(n>=row+1){
            row++;
            n=n-row;
        }
       return row;   
    }
}