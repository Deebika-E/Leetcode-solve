// Last updated: 4/10/2026, 8:19:58 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        Map<Character,Integer> map=new HashMap<>();
5        int left=0;
6        int max=0;
7        for(int right=0;right<s.length();right++){
8            char ch=s.charAt(right);
9            if(map.containsKey(ch)){
10                left=Math.max(left,map.get(ch)+1);
11            }
12                map.put(ch,right);
13                max=Math.max(max,right-left+1);
14            
15        }
16      return max;
17    }
18}