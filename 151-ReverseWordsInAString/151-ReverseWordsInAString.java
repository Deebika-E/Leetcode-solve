// Last updated: 1/24/2026, 3:27:10 PM
class Solution {
    public String reverseWords(String s) {

        String []words=s.split(" +");

        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}