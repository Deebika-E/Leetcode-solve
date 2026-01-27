// Last updated: 1/27/2026, 6:55:34 PM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int left=0;
4        int right=letters.length-1;
5        while(left<=right){
6            int mid=(left+right)/2;
7            if(letters[mid]<=target)
8                left=mid+1;
9            else
10                right=mid-1;
11
12
13        }
14
15        return letters[left%letters.length];
16        
17    }
18}