// Last updated: 1/24/2026, 3:25:37 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
       if(purchaseAmount%10<=4)
          return 100-(purchaseAmount/10)*10;
        else
          return 100-((purchaseAmount/10)+1)*10;
    }
}