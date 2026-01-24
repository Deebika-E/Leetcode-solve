// Last updated: 1/24/2026, 3:27:05 PM
class Solution {
    public int trailingZeroes(int n){
      int count= 0; 

      while(n>0){
        n=n/5;
        count+=n;
      }
      return count;
    }
}