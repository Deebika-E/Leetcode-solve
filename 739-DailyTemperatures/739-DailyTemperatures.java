// Last updated: 1/24/2026, 3:26:37 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int n=temp.length;
        Stack<Integer> s = new Stack();
        int [] ans = new int[n];

        for(int cd = 0; cd<n;cd++){
            int x = temp[cd];

            while(!s.empty() && x>temp[s.peek()]){
                ans[s.peek()] = cd - s.peek();
                s.pop();
            }

            s.push(cd);
        }
        return ans;
        
    }
}