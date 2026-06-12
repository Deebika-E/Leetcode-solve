// Last updated: 6/12/2026, 7:26:22 PM
1class Solution {
2    public int minMovesToSeat(int[] seats, int[] students) {
3        Arrays.sort(seats);
4        Arrays.sort(students);
5        int sum=0;
6        for(int i=0;i<seats.length;i++){
7    
8                int sub=Math.abs(students[i]-seats[i]);
9                sum+=sub;
10        }
11        return sum;
12    }
13}