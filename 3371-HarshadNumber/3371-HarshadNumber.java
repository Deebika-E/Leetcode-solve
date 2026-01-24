// Last updated: 1/24/2026, 3:25:35 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int org=x;
        while(x!=0){
            sum+=x%10;
            x/=10;

        }
       return (org%sum==0)?sum:-1;

        
    }
}
