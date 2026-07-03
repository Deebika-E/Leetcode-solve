// Last updated: 7/3/2026, 8:54:58 PM
1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        if(arr.length < 3) return false;
4        int l = 0;
5        int r = arr.length - 1;
6        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) l++;
7        while(r - 1 > 0 && arr[r] < arr[r - 1]) r--;
8        return l == r;
9    }
10}