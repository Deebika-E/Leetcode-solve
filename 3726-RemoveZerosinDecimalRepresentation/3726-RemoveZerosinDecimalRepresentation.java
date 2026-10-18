// Last updated: 10/18/2026, 7:51:09 PM
1class Solution {
2    public long removeZeros(long n) {
3        String rev="";
4        String str=String.valueOf(n);
5        for(int i=0;i<str.length();i++){
6            if(str.charAt(i)=='0'){
7                continue;
8            }else{
9                rev+=str.charAt(i);
10            }
11        }
12        return Long.parseLong(rev);
13        
14    }
15}