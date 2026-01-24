// Last updated: 1/24/2026, 3:26:15 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newDrink=empty/numExchange;
            empty=(empty%numExchange)+newDrink;
            drink+=newDrink;

        }
        
       return drink; 
    }
}