// Last updated: 2/2/2026, 8:08:32 PM
1class Solution {
2    public String firstPalindrome(String[] words) {
3        
4        for(String word:words){
5            if(isPalindrome(word))
6               return word;
7
8        }
9
10        return "";
11
12    }
13      private boolean isPalindrome(String s){
14        int left=0;
15        int right=s.length()-1;
16
17        while(left<right){
18            if(s.charAt(left)!=s.charAt(right)){
19                return false;
20            }
21            left++;
22            right--;
23        }
24
25        return true;
26      }
27}
28
29