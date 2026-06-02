// Last updated: 6/2/2026, 7:01:58 PM
1class Solution {
2    public List<List<Integer>> generate(int numrows) {
3
4        List<List<Integer>> result=new ArrayList<>();
5
6        if(numrows==0)  return result;
7
8        List<Integer>firstrow=new ArrayList<>();
9        firstrow.add(1);
10        result.add(firstrow);
11
12        if(numrows==1)  return result;
13        for(int i=1;i<numrows;i++){
14            List<Integer> prevrow=result.get(i-1);
15            ArrayList<Integer> row=new ArrayList<>();
16
17            row.add(1);
18            for(int j=0;j<i-1;j++){
19                row.add(prevrow.get(j)+prevrow.get(j+1));
20            }
21            row.add(1);
22
23            result.add(row);
24        }
25      return result;  
26    }
27}