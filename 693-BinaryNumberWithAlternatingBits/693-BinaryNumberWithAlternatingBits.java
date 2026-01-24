// Last updated: 1/24/2026, 3:26:38 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x;
        x=(n^(n>>1));

        return (x&(x+1))==0?true:false;
        
    }
}