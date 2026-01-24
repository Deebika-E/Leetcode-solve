// Last updated: 1/24/2026, 3:26:59 PM
class Solution {
    public boolean isUgly(int n) {

    if(n<=0)  return false;
     while(n%2==0){
        n/=2;
     } 
     while(n%3==0){
        n/=3;
     } 
     while(n%5==0){
        n/=5;
     } 

    return (n!=1)?false:true;
       
    }
}