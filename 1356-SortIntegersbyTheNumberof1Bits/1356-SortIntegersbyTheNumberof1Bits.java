// Last updated: 2/25/2026, 10:25:56 AM
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        Integer temp[]=new Integer[arr.length];
4
5        for(int i=0;i<arr.length;i++){
6              temp[i]=arr[i];
7        }
8        Arrays.sort(temp,(a,b) ->{
9            int bita=Integer.bitCount(a);
10            int bitb=Integer.bitCount(b); 
11
12            if(bita==bitb){
13                return a-b;
14            }
15
16        return bita-bitb;
17
18        });
19
20        for(int i=0;i<arr.length;i++){
21            arr[i]=temp[i];
22        }
23
24      return arr;
25    }
26}