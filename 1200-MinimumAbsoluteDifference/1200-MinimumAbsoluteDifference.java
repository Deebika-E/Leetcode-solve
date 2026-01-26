// Last updated: 1/26/2026, 11:33:33 AM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3
4        Arrays.sort(arr);
5        int mindiff=Integer.MAX_VALUE;
6        for(int i=1;i<arr.length;i++){
7            mindiff=Math.min(mindiff,arr[i]-arr[i-1]);
8               
9            
10        }
11        List<List<Integer>> result=new ArrayList<>();
12
13        for(int i=1;i<arr.length;i++){
14            if(arr[i]-arr[i-1]==mindiff){
15                result.add(Arrays.asList(arr[i-1], arr[i]));
16            }
17        }
18        return result;
19    }
20}