// Last updated: 1/24/2026, 3:26:51 PM
class Solution {
    public boolean isPerfectSquare(int num) {

        int left=1;
        int right=num;
        while(left<=right){
            int mid=(left+right)/2;
            long square=(long)mid*mid;
            if(square==num)
               return true;
            else if(square<num)
                left=mid+1;
            else
                right=mid-1;


        }


        return false;
        
    }
}