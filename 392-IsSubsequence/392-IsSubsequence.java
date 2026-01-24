// Last updated: 1/24/2026, 3:26:48 PM
class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length()==0)
          return true;
        int i=0;
        int j=0;

        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else{
            j++;
            }

            if(i==s.length()){
              return true;
            }
        }
     return false;
    }
}