// Last updated: 1/24/2026, 3:27:02 PM
class Solution {
    public static int sumofsquares(int n) {
      int sum=0;
      int d=0;
      while(n!=0){
        d=n%10;
        sum+=d*d;
        n/=10;
      }  

    return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=sumofsquares(slow);
            fast=sumofsquares(sumofsquares(fast));
        }while(slow!=fast);

        return slow==1?true:false;
    }

} 