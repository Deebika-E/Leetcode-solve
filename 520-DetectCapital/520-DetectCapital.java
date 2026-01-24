// Last updated: 1/24/2026, 3:26:39 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        
        int   ccount=0;

        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)){
                  ccount++;
            }
        }
      

        if(ccount==word.length()){
            return true;
        }

        if(ccount== 0){
            return true;
        }

        if(ccount == 1 && Character.isUpperCase(word.charAt(0))){
            return true;

        }
     return false;
        
    }
}