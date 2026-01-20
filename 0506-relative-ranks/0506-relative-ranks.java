class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];

        //Integer [] sorted = new Integer[score.length];  use Integer instead of int  if you need to use collections 

        int n=score.length;

        int[] sorted = new int[n];
        int id =0;

       
        for(int i: score){
            sorted[id]=i;
            id++;
        }

          //Arrays.sort(sorted,Collections.reverseOrder());
          Arrays.sort(sorted);

        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(score[i]==sorted[j]){
                    if(j==n-1){
                        ans[i]="Gold Medal";
                    }else if(j==n-2){
                        ans[i]="Silver Medal";
                    }else if(j==n-3){
                        ans[i]="Bronze Medal";
                    }else{
                        ans[i]=Integer.toString(n-j);
                    }
                    break;

                }
            }
        }
        return ans;
    }
}