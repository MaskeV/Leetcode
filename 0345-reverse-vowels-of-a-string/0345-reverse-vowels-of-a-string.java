class Solution {
    public String reverseVowels(String s) {
    //     StringBuilder ans = new StringBuilder();
    //     char[] word = s.toCharArray();
    //     int start=0,end=s.length()-1;
    //  String vowels = "aeiouAEIOU";

    //  while(start<end){
    //     while(start < end &&  vowels.indexOf(word[start])==-1){
    //         start++;        
    //   }
    //   while(start<end && vowels.indexOf(word[end])==-1){
    //         end--;
    //   }
    //   char temp = word[start];
    //   word[start]=word[end];
    //   word[end]=temp;

    //   start++;
    //   end--;
    //  }

        

    //     String answer = new String(word);
    //     return answer;

    char [] ans = s.toCharArray();
    int lhs=0,rhs=s.length()-1;
    while(lhs<rhs){
        while(lhs<rhs && (ans[lhs]!='a'&& ans[lhs]!='e'&& ans[lhs]!='i'&& ans[lhs]!='o'&& ans[lhs]!='u'&& ans[lhs]!='A'&& ans[lhs]!='E'&& ans[lhs]!='I'&&ans[lhs]!='O'&& ans[lhs]!='U')){
            lhs++;
        }
          while(lhs<rhs &&  (ans[rhs]!='a'&& ans[rhs]!='e'&& ans[rhs]!='i'&& ans[rhs]!='o'&& ans[rhs]!='u'&& ans[rhs]!='A'&& ans[rhs]!='E'&& ans[rhs]!='I'&&ans[rhs]!='O'&& ans[rhs]!='U')){
            rhs--;
        }
        char temp = ans[lhs];
        ans[lhs]=ans[rhs];
        ans[rhs]=temp;

        rhs--;
        lhs++;
    
    }
    String res =new String(ans);
    return res;


    }
}