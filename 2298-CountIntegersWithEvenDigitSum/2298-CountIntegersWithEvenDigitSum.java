// Last updated: 1/24/2026, 3:25:58 PM
class Solution {
    public int countEven(int num) {
    
        int count = 0;
        for(int i =1 ;i<=num;i++){
             int sum = 0;
             String s =String.valueOf(i);

             for(char c:s.toCharArray()){
                sum+=c -'0';
             }

             if(sum%2 ==0){
                 count++;
             }
           
          }
          return count;
        }
    }
    
