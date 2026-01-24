// Last updated: 1/24/2026, 3:26:34 PM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet();
        for(String word:words){
            StringBuilder sb= new StringBuilder();
            for(char c:word.toCharArray()){
                sb.append(morse[c-'a']);
         
            }   
        set.add(sb.toString());
        }

        return set.size();
        
    }
}