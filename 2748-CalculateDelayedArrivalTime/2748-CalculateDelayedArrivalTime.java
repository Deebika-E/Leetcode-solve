// Last updated: 1/24/2026, 3:25:42 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
         if((arrivalTime+delayedTime)<24)
           return arrivalTime+delayedTime;

        else
           return(arrivalTime+delayedTime)%24;
        
    }
}