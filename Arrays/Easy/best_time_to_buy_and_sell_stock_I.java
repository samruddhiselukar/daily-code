/*
Optimal: Time = O(N), Space = O(1)
*/

int[] price = {7,1,5,3,6,4};
int profit = 0;
int minPrice = price[0];
for(int i=1; i<price.length; i++){
  int cost = price[i] - price[i-1];
  minPrice = Math.min(price[i], minPrice);
  profit = Math.max(cost, profit);
}
return profit;
