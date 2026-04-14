// Last updated: 4/14/2026, 8:52:45 AM
1class Solution {
2    public int countGoodTriplets(int[] arr, int a, int b, int c) {
3        int count=0;
4        int n=arr.length;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                    if(Math.abs(arr[i]-arr[j])<=a){
8                        for(int k=j+1;k<n;k++){
9                            if((Math.abs(arr[j]-arr[k])<= b && Math.abs(arr[i]-arr[k])<= c)){
10                                count++;
11                            }
12                    }
13                }
14            }
15        }
16        return count;
17    }
18}