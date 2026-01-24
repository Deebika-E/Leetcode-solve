// Last updated: 1/24/2026, 3:25:36 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0,num2=0;

        for(int i=0;i<=n;i++){
            if(i%m==0)
                num2+=i;

            else
                num1+=i;
        }
       return num1-num2;
    }
}