class Solution {
    public long maxWeight(int[] pizzas) {
        // int ans=0;
        // Arrays.sort(pizzas);
        // int divide= pizzas.length/4;
        // int i=0;
        // int count=0;
        // while(divide>0){
        //  if(divide%2==0){
        //      ans+=pizzas[pizzas.length-3-i];
             
        //  }else{
        //      ans+=pizzas[pizzas.length-1-i];
        //  }

        //    count++; 
        //    divide--;
        //     if(count==2){
        //         i++;
        //     }
            
              
        // }        
        // return ans;


        int n=pizzas.length,m=n/4,z=(m+1)/2,y=m/2,j=0;
        Arrays.sort(pizzas);
        long ans =0;
        for(int i=0;i<z;i++){
            ans+= pizzas[n-1-j];
            j++;
        }
        for(int i=0;i<y;i++){
            ans+= pizzas[n-1-j-1];
            j+=2;
    
        }
        return ans;
    }


}

