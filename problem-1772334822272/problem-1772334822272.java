// Last updated: 3/1/2026, 8:43:42 AM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        int end=s.length()-1;
4        
5        for(int i=s.length()-1;i>=0;i--){
6            char ch =s.charAt(i);
7        
8        if(ch ==  'a'||ch == 'e'||ch == 'i'||ch  == 'o'||ch == 'u'){
9            end--; 
10        }else{
11            break;
12        }
13    }
14       return s.substring(0,end+1); 
15    }
16}