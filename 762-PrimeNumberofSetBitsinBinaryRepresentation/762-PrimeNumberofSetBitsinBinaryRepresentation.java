// Last updated: 2/21/2026, 2:51:04 PM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count=0;
4        for(int i=left;i<=right;i++){
5             int setbits=Integer.bitCount(i);
6             if(isPrime(setbits)){
7                count++;
8             }
9        }
10
11    return count;
12
13        
14    }
15
16      private boolean isPrime(int n){
17        if(n<=1)  return false;
18
19
20        for(int i=2;i*i<=n;i++){
21            if(n%i==0){
22                return false;
23            }
24        }
25
26        return true;
27      }
28}