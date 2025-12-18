package assignment7;

public class ConditionalStatements {

	public static void main(String[] args) {
		String customerName="John Doe";
		int creditScore=720;		
		float income= 55000.0f;
		boolean isEmployeed=true;
		float debtToIncomeRatio = 35.0f;
		
		
		
		if (creditScore>750){
			System.out.println("Loan is automatically approved.");
		}
		else if(creditScore<750 && creditScore>=650) {
			if (income>=50000) {
				if (isEmployeed == true) {
					if(debtToIncomeRatio>=40) {
						System.out.println(customerName+" Your Loan is approved.");
					}
					else {
						System.out.println("Loan denied as debtToIncomeRatio is less than 40% .");
					}
				}
				else {
					System.out.println("Loan denied as "+customerName+" is Unemployeed");
				}
			}
			else {
				System.out.println("Loan is automatically denied as creditscore is less than 650.");
			}
		}

	}

}
