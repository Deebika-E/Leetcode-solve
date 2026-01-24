// Last updated: 1/24/2026, 3:26:19 PM
class Solution {
    public int numberOfSteps(int num) {
        int step=0;

        while(num!=0){
            if(num%2==0)
              num/=2;

            else
              num-=1;

            step++;
        }

        return step;


        
    }
}