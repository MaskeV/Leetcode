class Solution {
    public String gcdOfStrings(String str1, String str2) {
    //     StringBuilder s = new StringBuilder();
    //     if(!((str1+str2).equals(str2+str1))){
    //         return "";
    //     }
    //   int gcdLength=gcd(str1.length(),str2.length());
    //     for(int i=0;i<gcdLength;i++){
    //         s.append(str2.charAt(i));
    //     }
    //     return s.toString();
    // }

    // private int gcd(int n,int m){
       
    //    int result=Math.min(n,m);
    //    while(result>0){
    //    if(n%result==0 && m%result==0){
    //     return result;
    //    }
    //    result--;
    //    }
    //    return 1;

    StringBuilder s = new StringBuilder();
    if(!((str1+str2).equals(str2+str1))){
        return "";
    }
    int gcdlength = gcd(str1.length(),str2.length());
    for(int i=0;i<gcdlength;i++){
        s.append(str2.charAt(i));
    }
return s.toString();

    }
    private int gcd(int m,int n){
        int result = Math.min(m,n);
        while(result>0){
            if(n%result==0 && m%result==0){
                return result;
            }
            result--;
        }
       return 1;

    }
   
}