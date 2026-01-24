// Last updated: 1/24/2026, 3:26:18 PM
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer temp[]=new Integer[arr.length];

        for(int i=0;i<arr.length;i++){
              temp[i]=arr[i];
        }
        Arrays.sort(temp,(a,b) ->{
            int bita=Integer.bitCount(a);
            int bitb=Integer.bitCount(b);

            if(bita==bitb){
                return a-b;
            }

        return bita-bitb;

        });

        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }

      return arr;
    }
}