// Last updated: 1/24/2026, 3:25:32 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigit =0;
        int doubleDigit = 0;
         
         for(int n:nums){
            if(n<10)
                singleDigit+=n;
            else
                doubleDigit+=n; 
         }
          
          if(singleDigit!=doubleDigit)
             return true;

          else
             return false;

         


        
    }
}