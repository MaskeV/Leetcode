class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
               String temp=operations[i];
               if(temp.equals("++X") || temp.equals("X++")){
                x+=1;
               }
               if(temp.equals("--X") || temp.equals("X--") ){
                x-=1;
               }
        }
return x;
    }
}