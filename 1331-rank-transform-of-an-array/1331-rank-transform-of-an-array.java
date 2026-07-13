class Solution {
    public int[] arrayRankTransform(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for(int i:arr){
           set.add(i);
        }
        int[] temp = new int[set.size()];
        int k=0;
        for(int i:set){
         temp[k]=i;
         k++;
        }
        Arrays.sort(temp);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<temp.length;j++){
                if(arr[i]==temp[j]){
                    arr[i]=j+1;
                    break;
                }
            }

            
        }

        return arr;
    }
}