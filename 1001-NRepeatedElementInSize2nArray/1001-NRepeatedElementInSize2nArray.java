// Last updated: 1/24/2026, 3:26:33 PM
class Solution {
    public int repeatedNTimes(int[] nums) {

        HashSet<Integer> s= new HashSet();

        for(int x:nums){
            if(s.contains(x)){
              return x;
            }
         s.add(x);

        }
      
      return -1;  
    }
}