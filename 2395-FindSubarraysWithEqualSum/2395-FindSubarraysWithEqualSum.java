// Last updated: 3/9/2026, 9:13:14 PM
1import java.util.*;
2
3class Solution {
4    public boolean findSubarrays(int[] nums) {
5        if(nums.length < 2) return false;
6        
7        Map<Integer, Integer> freq = new HashMap<>();
8        
9        for(int i = 0; i < nums.length - 1; i++){
10            int sum = nums[i] + nums[i + 1];
11            if(freq.getOrDefault(sum, 0) > 0){
12                return true;
13            }
14            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
15        }
16        
17        return false;
18    }
19}