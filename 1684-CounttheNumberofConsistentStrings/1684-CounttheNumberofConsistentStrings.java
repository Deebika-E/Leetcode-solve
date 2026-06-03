// Last updated: 6/3/2026, 7:19:08 AM
1class Solution {
2    public int countConsistentStrings(String allowed, String[] words) {
3        HashSet<Character> set=new HashSet<>();
4        for(char ch:allowed.toCharArray()){
5            set.add(ch);
6        }
7        int count=0;
8        for(String word:words){
9            boolean consistent=true;
10               for(char ch : word.toCharArray()) {
11
12                if(!set.contains(ch)) {
13                    consistent = false;
14                    break;
15                }
16            }
17
18            if(consistent) {
19                count++;
20            }
21        }
22
23        return count;
24    }
25}