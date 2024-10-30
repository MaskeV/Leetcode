class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int canPlant=0;

        if(len==1 && flowerbed[0]==0 && n==1){
            return true;
        }

        if(len>1 && flowerbed[0]==0){
            if(flowerbed[1]==0){
                flowerbed[0]=1;
                canPlant++;
            }
        }

        for(int i=1;i<len-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                canPlant++;
            } 
        }
        if(len>1 && flowerbed[len-1]==0){
          if(flowerbed[len-2]==0){
            flowerbed[len-2]=1;
            canPlant++;
          }

        }

        return canPlant >= n;
    }
}