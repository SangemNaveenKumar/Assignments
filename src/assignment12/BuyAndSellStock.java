package assignment12;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4}; //[7,6,4,3,1] [7,1,5,3,6,4]
		short Buy_day=0;
		short Sell_day=0;
		int profit=0;
		
		for (int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				
				if (profit<(prices[j]-prices[i])){
					profit=(prices[j]-prices[i]);
					Buy_day=(short) (i+1);
					Sell_day=(short) (j+1);
				}
			}
		}
		System.out.println("Buy_Day:"+ Buy_day);
		System.out.println("Sell_day:"+ Sell_day);
		System.out.println("profit:"+ profit);
	}

}
