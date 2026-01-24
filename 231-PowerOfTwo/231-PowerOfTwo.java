// Last updated: 1/24/2026, 3:27:00 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return(n>0&& ((n&(n-1))==0));

    }
}