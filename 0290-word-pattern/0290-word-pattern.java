class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        Map<Character,String> map = new HashMap<>();
        Set<String> checked = new HashSet<>();
        if(arr.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
                }
            } else if(checked.contains(arr[i])){
                return false;
            }
            else{
            map.put(pattern.charAt(i),arr[i]);
            checked.add(arr[i]);
            }
        }
        return true;
    }

}