// Last updated: 4/12/2026, 9:15:30 AM
1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3       int count=0;
4       for(int i=0;i<hours.length;i++){
5            if(target<=hours[i]){
6                count++;
7
8            }
9       } 
10       return count; 
11    }
12}