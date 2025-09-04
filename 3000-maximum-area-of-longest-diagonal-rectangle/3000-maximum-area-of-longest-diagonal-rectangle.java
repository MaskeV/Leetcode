class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0],w=dimensions[i][1];
            double dig = Math.sqrt((l*l)+(w*w));
            if(max<dig){
            max = Math.max(max,dig);
            area = l*w;
            }
            if(max==dig && area<l*w){
                area=l*w;
            }
        }
        return area;
    }
}