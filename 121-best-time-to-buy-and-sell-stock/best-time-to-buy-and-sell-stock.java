class Solution {
    public int maxProfit(int[] p) {
        int buyPrice = p[0];
        int sellPrice = 0;
        for(int i=0; i<p.length; i++){
            int cost = p[i] - buyPrice;
            sellPrice = Math.max(cost, sellPrice);
            buyPrice = Math.min(buyPrice, p[i]); 
        }
        return sellPrice;
    }
}