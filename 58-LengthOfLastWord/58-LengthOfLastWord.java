// Last updated: 1/24/2026, 3:27:18 PM
class Solution {
    public int lengthOfLastWord(String s) {

        String str=s.trim();
        int count=0;

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ')
              count++;

            else
              break;
        }

        return count;
        
    }
}