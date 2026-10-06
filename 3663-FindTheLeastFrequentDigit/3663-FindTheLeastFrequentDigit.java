// Last updated: 10/6/2026, 6:37:18 PM
1class Solution {
2    public int getLeastFrequentDigit(int n) {
3       int []freq = new int[10];
4       int temp=n,hash=10,ans=0;
5       while(temp>0){
6           freq[temp%10]++;
7           temp/=10;
8       }
9       for(int i=9;i>=0;i--){
10            if(freq[i]==0) continue;
11            else{
12                if(freq[i]<=hash){
13                    hash=freq[i];
14                    ans=i;
15                }
16            }
17       }
18    return ans;
19    }
20}