// Last updated: 1/24/2026, 3:26:09 PM
class Solution {
    public String truncateSentence(String s, int k) {
      
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
              count++;
               if(count==k)
                 break;
          
           }
           sb.append(s.charAt(i));
     
        }

        return sb.toString();
    
    }
}