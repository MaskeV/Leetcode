class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];

        //Integer [] sorted = new Integer[score.length];  use Integer instead of int  if you need to use collections 

        int[] sorted = new int[score.length];
        int id =0;

       
        for(int i: score){
            sorted[id]=i;
            id++;
        }

          //Arrays.sort(sorted,Collections.reverseOrder());
          Arrays.sort(sorted);

        for(int i=0;i<score.length;i++){
            for(int j=sorted.length-1;j>=0;j--){
                if(score[i]==sorted[j]){
                    if(j==sorted.length-1){
                        ans[i]="Gold Medal";
                    }else if(j==sorted.length-2){
                        ans[i]="Silver Medal";
                    }else if(j==sorted.length-3){
                        ans[i]="Bronze Medal";
                    }else{
                        ans[i]=Integer.toString(sorted.length-j);
                    }

                }
            }
        }
        return ans;
    }
}