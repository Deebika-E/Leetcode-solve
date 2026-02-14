// Last updated: 2/14/2026, 9:12:18 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3
4        int n=words.length;
5        int ans[]=new int[n];
6
7        for(int i=0;i<n;i++){
8            String word=words[i];
9            int sum=0;
10            for(char ch:word.toCharArray()){
11                sum+=weights[ch-'a'];
12            }
13            ans[i]=sum;
14            
15        }
16        StringBuilder sb = new StringBuilder("");
17        for(int i=0;i<n;i++){
18            char ch='z';
19            for(int j=0;j<ans[i]%26;j++){
20                ch--;
21            }
22            sb.append(ch);
23        }
24        
25       return sb.toString();
26    }
27}