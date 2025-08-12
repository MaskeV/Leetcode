class Solution {
    public int[] productQueries(int n, int[][] queries) {
       
           String binaryString = Integer.toBinaryString(n);
            int[] powers = new int[queries.length];
            Arrays.fill(powers,1);
            List<Integer> list = new ArrayList<>();
            int idx=0;
         for(int i=binaryString.length()-1;i>=0;i--){
            if(binaryString.charAt(i)=='1'){
                list.add((int)1L << idx);
            }
            idx+=1;
         }
         int id=0;
         for(int i=0;i<queries.length;i++){ 
            int start = queries[i][0];
            while(start<=queries[i][1]){
powers[i]*=list.get(start);
start++;
            }
            }
            return powers;
         }
    
}