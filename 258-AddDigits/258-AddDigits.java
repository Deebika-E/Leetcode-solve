// Last updated: 1/24/2026, 3:26:57 PM
class Solution {
    public int addDigits(int num) {              
        if(num==0)
        return 0;
        return num%9==0?9:num%9; 
       
        
    }
}