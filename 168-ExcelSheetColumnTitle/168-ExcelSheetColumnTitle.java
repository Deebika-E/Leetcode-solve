// Last updated: 1/24/2026, 3:27:09 PM
class Solution {
    public String convertToTitle(int num){  
        StringBuffer ans = new StringBuffer();
        while(num>0){
            num--;
            ans.append((char)((num% 26) + 65));
            num /=26;
        }
       return ans.reverse().toString(); 

    }
}