// Last updated: 2/15/2026, 8:50:47 AM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        Set<Integer> set=new HashSet<>();
4
5        for(int bulb:bulbs){
6            if(set.contains(bulb)){
7                set.remove(bulb);
8            }else{
9                set.add(bulb);
10            }
11        }
12
13        List<Integer> result = new ArrayList<>(set);
14        Collections.sort(result);
15
16        return result;
17    }
18}