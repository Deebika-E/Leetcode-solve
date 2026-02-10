// Last updated: 2/10/2026, 10:31:10 PM
1class Solution {
2    public String reverseVowels(String s) {
3
4        char []arr=s.toCharArray();
5        int left=0;
6        int right=arr.length-1;
7
8        while(left<right){
9            while(left<right&&!isVowel(arr[left])){
10                left++;
11            }
12            while(left<right&&!isVowel(arr[right])){
13                right--;
14            }
15
16
17            char temp=arr[left];
18            arr[left]=arr[right];
19            arr[right]=temp;
20
21            left++;
22            right--;
23        }
24
25        return new String(arr);
26    }
27
28        private boolean isVowel(char c){
29
30             return "aeiouAEIOU".indexOf(c)!=-1;
31
32        }
33        
34    
35}