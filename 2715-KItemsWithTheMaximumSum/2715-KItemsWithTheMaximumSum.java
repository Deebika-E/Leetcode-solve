// Last updated: 1/24/2026, 3:25:43 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
       if(k<=numOnes)
         return k;
       else if( k<=numOnes+numZeros)
         return numOnes;
       else
         return numOnes-(k-(numOnes+numZeros));
        

        
    }
}













