// Last updated: 6/16/2026, 8:53:34 PM
1
2class Solution {
3    public int calPoints(String[] operations) {
4        Stack<Integer> stack = new Stack<>();
5        
6        for (String each : operations) {
7            if (each.equals("+")) {
8                int top = stack.pop();
9                int peek = stack.peek();
10                stack.push(top);
11                stack.push(top + peek);
12            } else if (each.equals("D")) {
13                stack.push(stack.peek() * 2);
14            } else if (each.equals("C")) {
15                stack.pop();
16            } else {
17                stack.push(Integer.parseInt(each));
18            }
19        }
20        
21        int sum = 0;
22        while (!stack.isEmpty()) {
23            sum += stack.pop();
24        }
25
26        return sum;
27    }
28}