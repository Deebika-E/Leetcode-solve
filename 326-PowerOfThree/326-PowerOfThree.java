// Last updated: 1/24/2026, 3:26:53 PM
class Solution {
    public boolean isPowerOfThree(int n) {
         if(n==0) return false;

        while(n%3==0){
            n/=3;
        }
        return n==1?true:false;
      
        
    }
}