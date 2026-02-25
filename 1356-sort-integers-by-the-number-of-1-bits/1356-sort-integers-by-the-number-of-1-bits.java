class Solution {
    public int[] sortByBits(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            int no=i;
            int bits=0;
            while(no>0){
                if(no%2==1){
                   bits++;
                }
                no=no/2;
            }
            map.put(i,bits);

            
        }



        Arrays.sort(arr);


         Integer[] tempArr = Arrays.stream(arr)
                                  .boxed()
                                  .toArray(Integer[]::new);

       
        Arrays.sort(tempArr,{(i,j) ->
           if(map.get(i)!=map.get(j)){
               if(map.get(i)>map.get(j)){
                return map.get(i)-map.get(j);
               }
             }
             return i-j;
           };
          
         );

        for(int i=0;i<arr.length;i++){
            arr[i]=tempArr[i];
        }
        return arr;
        
        
    }
}