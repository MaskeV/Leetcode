class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];

        Integer [] sorted = new Integer[score.length];
        int id =0;

       
        for(int i: score){
            sorted[id]=i;
            id++;
        }

         Arrays.sort(sorted,Collections.reverseOrder());


        for(int i=0;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if(score[i]==sorted[j]){
                    if(j==0){
                        ans[i]="Gold Medal";
                    }else if(j==1){
                        ans[i]="Silver Medal";
                    }else if(j==2){
                        ans[i]="Bronze Medal";
                    }else{
                        ans[i]=Integer.toString(j+1);
                    }

                }
            }
        }
        return ans;
    }
}