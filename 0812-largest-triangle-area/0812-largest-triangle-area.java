class Solution {
    public double largestTriangleArea(int[][] points) {
        int x=0,y=0;
        for(int i=0;i<points.length;i++){
            if(points[i][0]>points[x][0]){
                x=i;
            }if(points[i][1]>points[y][1]){
                y=i;
            }
        }
        return 0.5*points[x][0]*points[y][1];
    }
}