// Last updated: 3/4/2026, 7:22:43 PM
1class Solution {
2    public List<Integer> addToArrayForm(int[] num, int k) {
3
4        ArrayList<Integer> ans = new ArrayList<>();
5
6        int i = num.length - 1;
7        int carry = 0;
8
9        while(i >= 0 || k > 0 || carry > 0){
10
11            int digit1 = (i >= 0) ? num[i] : 0;
12            int digit2 = (k > 0) ? k % 10 : 0;
13
14            int sum = digit1 + digit2 + carry;
15
16            ans.add(sum % 10); 
17            carry = sum / 10;    
18
19            if(i >= 0) i--;
20            k = k / 10;
21        }
22
23        Collections.reverse(ans);
24        return ans;
25    }
26}