class Solution {
    public String intToRoman(int num) {
        
        int[] arr= {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb = new StringBuilder();
        

        //while (num>0){
           // int i=0;
           // while(i<arr.length-1){
             //   if(arr[i]==num){
                    //num=num-arr[i];
                    //sb.append(roman[i]);
                   // break;
                 //}if(arr[i]>num){
                    //num-=arr[i-1];
                  //  sb.append(roman[i-1]);
                //}
              //  i++;
            //}
            //if(i==arr.length-1){
              //  sb.append(roman[i]);
            //    num-=arr[i];
          //  }
        //}


        for(int i=arr.length-1;i>=0;i--){
            while(num>=arr[i]){
                sb.append(roman[i]);
                num-=arr[i];
            }
        }
           return sb.toString();       
    }

}