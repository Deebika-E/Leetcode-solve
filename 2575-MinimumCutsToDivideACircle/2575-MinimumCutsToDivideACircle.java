// Last updated: 1/24/2026, 3:25:50 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        return 0;
        if(n%2==0)
        return n/2;
        else
        return n;

        
    }
}