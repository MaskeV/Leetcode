class Solution {
    public String reverseWords(String s) {
       //String[] words = s.trim().split("\\s+");
 
       List<String> words = new ArrayList<>();
       StringBuilder word = new StringBuilder();
       String t=s.trim();

       for(int i=0;i<t.length();i++){
        char c = t.charAt(i);
        if(c==' ' && word.isEmpty()){
            continue;
        }else  if(c==' '){
           words.add(word.toString());
           word= new StringBuilder("");
        }else{
            word.append(c);
        }

           
       }
       int i=words.size()-1;
      while(i>=0){
        word.append(' ');
        word.append(words.get(i));
        i--;
      }

      return word.toString();
        //int i=0;
        //int j=words.length-1;
        //while(i<j){
            //String temp = words[i];
          //  words[i]=words[j];
            //words[j]=temp;
            //i++;
            //j--;
        //}

        //StringBuilder sb = new StringBuilder();
        //for(String word:words){
         //   if(sb.length()>0){
           //     sb.append(" ");
            //}
            //sb.append(word);
        //}
       // return sb.toString();
        // return String.join(" ",words);
    }
}