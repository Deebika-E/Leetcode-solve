// Last updated: 1/24/2026, 3:26:52 PM
class Solution {
    public void reverseString(char[] s) {
               int left = 0;
               int right = s.length- 1;

               while(left<right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;

                left++;
                right--;


               }

        
    }
}