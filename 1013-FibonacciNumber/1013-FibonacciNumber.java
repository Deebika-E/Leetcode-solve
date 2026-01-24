// Last updated: 1/24/2026, 3:26:31 PM
class Solution {
    public int fib(int n) {
        if(n==1) return n;
        if(n==0) return n;

        int p1=0,p2=1;
        int next=0;

        for(int i=2;i<=n;i++){
            next=p1+p2;
            p1=p2;
            p2=next;
        }
        return next;
    }
}