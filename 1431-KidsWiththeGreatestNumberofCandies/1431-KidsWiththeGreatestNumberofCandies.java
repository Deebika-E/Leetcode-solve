// Last updated: 5/1/2026, 7:20:29 PM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        int maxcandies=0;
4        for(int candy:candies){
5            maxcandies=Math.max(maxcandies,candy);
6        }
7        List<Boolean> result=new ArrayList<>();
8
9        for(int candy:candies){
10            if(candy+extraCandies>=maxcandies){
11                result.add(true);
12            }else{
13                result.add(false);
14            }
15        }
16      return result;
17    }
18}