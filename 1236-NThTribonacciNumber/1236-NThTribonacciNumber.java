// Last updated: 1/24/2026, 3:26:25 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0||n==1) return n;
        if(n==2) return 1;

        int p1=0,p2=1,p3=1;
        int next=0;

        for(int i=1;i<=n-2;i++){
            next=p1+p2+p3;
            p1=p2;
            p2=p3;
            p3=next;
        }
        return next;
        
    }
}