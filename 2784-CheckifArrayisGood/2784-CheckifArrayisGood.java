// Last updated: 5/14/2026, 7:34:49 PM
1class Solution {
2    public boolean isGood(int[] nums) {
3         int n=nums.length-1;
4         Set<Integer> per=new HashSet<>();
5         boolean dup=false;
6
7         for(int num:nums){
8            if(num>n)  return false;
9
10            if(per.contains(num)){
11                 if(num<n||dup) return false;
12                  dup=true;
13                  continue;
14           }
15         per.add(num);
16      }
17
18      return true;
19    }
20}