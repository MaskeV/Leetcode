class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            pascal.add(pascal(i));
        }

        return pascal;

    }  
    List<Integer> pascal(int n){
        List<Integer> temp= new ArrayList<>(1);
        if(n==0){
            temp.add(1);
        }
         else if(n==1){
            temp.add(1);
            temp.add(1);
        }
        else{
            temp.add(1);
            List<Integer> t = pascal(n-1);
            for(int i=0;i<t.size()-1;i++){
                temp.add(t.get(i)+t.get(i+1));
            }
            temp.add(1);
        }
     

        return temp;
    }
    
}
