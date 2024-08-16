class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char jew:jewels.toCharArray())
            for(char sto:stones.toCharArray())
                if(jew==sto){
                    count++;
        }
        return count;
    }
}