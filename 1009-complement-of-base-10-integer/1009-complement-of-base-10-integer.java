class Solution {
    public int bitwiseComplement(int n) {
    StringBuilder  binary = new StringBuilder();

    while(n>0){
         binary.append(n%2);
         n = n/2;
    }
    binary = binary.reverse();
     
     for(int i=0;i<binary.length();i++){
        if(binary.charAt(i)=='1'){
            binary.setCharAt(i,'0');
        }else{
            binary.setCharAt(i,'1');
        }
     }
     if(binary.length()==0){
        return 1;
     }
     return Integer.parseInt(binary.toString(),2);
        
    }
}
