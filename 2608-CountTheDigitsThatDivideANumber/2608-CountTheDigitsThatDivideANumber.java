// Last updated: 1/24/2026, 3:25:49 PM
class Solution {
    public int countDigits(int num) {
       int count=0;
       int temp=num;

       while(num!=0){
            int digit=num%10;
            if(temp%digit==0) 
             count++;
             num/=10;   
       } 
       return count;
    }
}