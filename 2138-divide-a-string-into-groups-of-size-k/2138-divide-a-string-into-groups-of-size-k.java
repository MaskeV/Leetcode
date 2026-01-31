class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (s.length()+k-1)/k;
        boolean flag=false;
        if(s.length()%k==0){
            flag = true;
        }

        String[] output = new String[n];
        int id=0;
        
        for(int i=0;i<s.length();i+=k){
            if(id==n-1 && !flag ){
                StringBuilder temp = new StringBuilder(s.substring(i,s.length()));
                int t= k-(s.length()%k);
                while(t>0){
                    temp.append(fill);
                    t--;
                }
                output[id]= temp.toString();
                break;
                
            }
            output[id]=s.substring(i,i+k);
            id++;

        }

        return output;
    }
}