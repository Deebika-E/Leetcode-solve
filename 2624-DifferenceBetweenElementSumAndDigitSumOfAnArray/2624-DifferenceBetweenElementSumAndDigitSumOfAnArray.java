// Last updated: 1/24/2026, 3:25:48 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digit=0;


        for(int i:nums){
            sum+=i;
            while(i!=0){
                digit+=i%10;
                i/=10;
            }

        }
       return sum-digit; 
    }
}