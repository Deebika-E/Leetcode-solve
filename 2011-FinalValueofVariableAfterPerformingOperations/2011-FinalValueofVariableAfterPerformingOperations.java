// Last updated: 6/10/2026, 8:13:08 PM
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        
4        int x=0;
5        for(String op:operations){
6            if(op.contains("++")){
7                x++;
8            }else if(op.contains("--")){
9                x--;
10            }
11        }
12     return x;
13    }
14}