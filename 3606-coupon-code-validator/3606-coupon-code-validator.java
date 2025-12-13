class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
         List<String> list = new ArrayList<>();
        List<String> liste = new ArrayList<>();
        List<String> listg = new ArrayList<>();
        List<String> listp = new ArrayList<>();
        List<String> listr = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(isActive[i] && isValidString(code[i])){
            
                if(businessLine[i].equals("electronics"))
                liste.add(code[i]);
                if(businessLine[i].equals("grocery"))
                listg.add(code[i]);
                if(businessLine[i].equals("pharmacy"))
                listp.add(code[i]);
                if(businessLine[i].equals("restaurant"))
                listr.add(code[i]);

            }
        }
        Collections.sort(liste);
        Collections.sort(listg);
        Collections.sort(listp);
        Collections.sort(listr);

        list.addAll(liste);
        list.addAll(listg);
        list.addAll(listp);
        list.addAll(listr);
        return list;
        
    }
    boolean isValidString(String s){
        if(s.isEmpty()){
            return false;
        }
        for(int i=0;i<s.length();i++){

            if(!(Character.isLetterOrDigit(s.charAt(i)) || s.charAt(i)=='_')){
                return false;
            }
        }
        return true;

    }
}