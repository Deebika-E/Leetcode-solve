// Last updated: 4/19/2026, 9:35:27 PM
1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        Set<Integer> friendSet = new HashSet<>();
4        for (int f : friends) {
5            friendSet.add(f);
6        }
7
8        List<Integer> result = new ArrayList<>();
9        for (int o : order) {
10            if (friendSet.contains(o)) {
11                result.add(o);
12            }
13        }
14
15        int[] arr = new int[result.size()];
16        for (int i = 0; i < result.size(); i++) {
17            arr[i] = result.get(i);
18        }
19
20        return arr;
21    }
22}