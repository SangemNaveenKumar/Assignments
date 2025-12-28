package assignment11;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number check if it is prime:");
		int number=sc.nextInt();
		boolean isPrime=true;
		if (number<=1) {
			System.out.println("are you kidding? 1 or less than one cannot be prime.");
		}
		else {
			for(int i=2;i*i<=number;i++) {
				if (number%i==0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime==false) {
				System.out.println(number+" is not prime number");
			}
			else {
				System.out.println(number+" is prime number");
			}
			sc.close();

		}
		
	}

}
