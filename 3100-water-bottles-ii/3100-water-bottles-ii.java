class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        int full=0;
        while((empty+full)>=numExchange)
        {
            total++;
            empty=empty-numExchange;
            numExchange=numExchange+1;
            full++;
        
        }
        
        return total;
        
        
    }
}