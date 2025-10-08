class Solution {
    public String triangleType(int[] nums) {
        int x=nums[0],y=nums[1],z=nums[2];
        if(x==y && y==z){
            return "equilateral";
        }
        if(x+y>z && y+z>x && z+x>y){
           if(x==y || y==z || z==x){
            return "isosceles";
           }else{
            return "scalene";
           }
        }
      return "none";  
    }
}