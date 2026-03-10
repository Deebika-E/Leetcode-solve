// Last updated: 3/10/2026, 9:04:54 PM
1class Solution {
2    public int[] decrypt(int[] code, int k) {
3
4        int n=code.length;
5
6        int temp[]=new int[n];
7        for(int i=0;i<n;i++){
8            if(k>0){
9                for(int j=i+1;j<i+1+k;j++){
10                    temp[i]+=code[j % n];
11                }
12            }else if(k<0){
13                   for (int j = i - 1; j > i - 1 - Math.abs(k); j--) {
14                      temp[i] += code[((j % n) + n) % n];
15                }
16
17            }
18        }
19      return temp;  
20    }
21}