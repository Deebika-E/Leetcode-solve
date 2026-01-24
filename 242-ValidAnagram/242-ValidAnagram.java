// Last updated: 1/24/2026, 3:26:58 PM
class Solution {
    public boolean isAnagram(String s, String t) {

         HashMap<Character,Integer> hm=new HashMap();

         if(s.length()!=t.length()) return false;
         
         for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
         }

         for(char ch: t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)-1);
         }
        for(int x:hm.values()){
            if(x!=0)  return false;
        }

    return true;
    }
}