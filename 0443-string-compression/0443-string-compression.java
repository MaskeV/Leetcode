class Solution {
    public int compress(char[] chars) {
        String s = "";
        int cnt =1, n = chars.length,j=0;
        if(n==1){
            return 1;
        }for(int i=0;i<n-1;i++){
            j++;
        
            if(chars[i]==chars[i+1]){
                 cnt++;
            }else{
                s+=chars[i]+"";
                StringBuilder ans = new StringBuilder();
                if(cnt>1){
                    while(cnt!=0){
                        ans.append(cnt%10+"");
                        cnt=cnt/10;
                    }
                }
                ans.reverse();
                s+=ans.toString();
                cnt=1;
            }
        }
        s+=chars[j]+"";
        StringBuilder ans = new StringBuilder();
        if(cnt>1){
            while(cnt!=0){
                ans.append(cnt%10+"");
                cnt=cnt/10;
            }
        }
        ans.reverse(); 
        s+=ans.toString();
        for(int i=0;i<s.length();i++){
            chars[i]= s.charAt(i);
        }
        return s.length();
    }
}