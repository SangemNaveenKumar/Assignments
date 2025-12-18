package assignment8;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConditionalStatementsAndLoops {

	public static void main(String[] args) {
		
		Long credited=0L,debited=0L;
		Map<Integer,Long> obj1= new LinkedHashMap<Integer,Long> ();
		
		obj1.put(1,50000l);
		obj1.put(2,-2000l);
		obj1.put(3,3000l);
		obj1.put(4,-15000l);
		obj1.put(5,-200l);
		obj1.put(6,-300l);
		obj1.put(7, 4000l);
		obj1.put(8, -3000l);
		
		//1. Print total number of credit and debit transactions completed
		System.out.println("1.Total number of credit and debit transactions completed: "+obj1.size());
		
		//2. Print the total amount credited and debited in account
		for(Long i:obj1.values()) {
			if (i<0) {
				debited+=i;
			}
			else credited+=i;
		}
		System.out.println("2.Total amount credit: "+credited+ " and Total amount debited: "+debited);
		
		//3. Print total amount remaining at the end in Bank Account
		System.out.println("3.Total amount remaining at the end in Bank Account: "+(credited+debited));
		//4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debitTransaction with Amount” and also print total number of suspicious transactions		
		int count=0;
		for (Long v:obj1.values()) {
			if (v>10000 || v<-10000) {
				System.out.println("4.Suspicious credit/debit Transaction with Amount: "+v);
				count++;
			}
		}
		System.out.println("5.Total Suspicious credit/debit Transactions: "+count);
		

	}

}
