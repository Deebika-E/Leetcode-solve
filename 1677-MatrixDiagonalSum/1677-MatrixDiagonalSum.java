// Last updated: 1/24/2026, 3:26:13 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0,j=0;
        int n=mat.length;
        for(int k=1;k<=n;k++){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        for(int k=1;k<=n;k++){
           if(i!=j) sum+=mat[i][j];
           i++;
           j--;
        }


       return sum;
    }
}