class Solution {
    public List<String> letterCombinations(String digits) {


        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
             return res;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi"); 
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        res.add("");

        for(int i=0;i<digits.length();i++){
            String temp=map.get(digits.charAt(i));
            List<String> tempRes = new ArrayList<>();
            for(String s : res){
                for(char c:temp.toCharArray()){
                    tempRes.add(s+c);
                }

            }
            res = tempRes;
         
        }
           return res;
    }
}