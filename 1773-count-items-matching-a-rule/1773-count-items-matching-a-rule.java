class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleMatch=0;
        int rule;
        if(ruleKey.equals("color")){
            rule=1;
        }else if(ruleKey.equals("type")){
            rule=0;
        }else{
            rule=2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(rule).equals(ruleValue)){
                ruleMatch++;
            }
        }
            return ruleMatch;
    }
}