class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      Map<Integer,Integer> map = new  HashMap<>();
      Set<Integer> set = new HashSet<>();

      for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      for(int i : map.keySet()){
        if(!set.add(map.get(i))){
            return false;
        }

      }
      return true;

    }
}

// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
//        Map<Integer,Integer> map = new  HashMap<>();
//       Set<Integer> set = new HashSet<>();

//       for(int i:arr){
//         map.put(i,map.getOrDefault(i,0)+1);
//       }
//         return map.size() == new HashSet<>(map.values()).size();
      
//     }
// }
