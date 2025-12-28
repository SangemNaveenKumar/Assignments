package assignment13;

import java.util.Scanner;

public class FindingPower {

	public static void main(String[] args) {
		double number=0;
		int n=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		number= sc.nextDouble();
		System.out.println("Enter the number to raise:");
		n=sc.nextInt();
		
		/*
		try {
		System.out.println("Enter the number:");
		number= sc.nextDouble();
		}
		catch (Exception e) {
			System.out.println("Enter the numbers");
		}
		
		try {
		System.out.println("Enter the number to raise:");
		n=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter the numbers");
		}*/
		
		
		double result=1L;
		
		
		if (n==0) {
			System.out.println("Results is 1");
			System.exit(0);
		}
		if (n<0) {
			n=(-1*n);
			number=(1/number);
		}
		for (int i=1;i<=n;i++) {
			result= (result*number);
		}
		
		System.out.println("result is:"+result);

	}

}
