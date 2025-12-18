package assignment5;


import java.util.LinkedList;
import java.util.List;

public class ArrayOfTenNumbers {

	public static void main(String[] args) {
		
		List<Integer> obj= new LinkedList<Integer>();
		obj.add(10);
		obj.add(100);
		obj.add(50);
		obj.add(70);
		obj.add(80);
		obj.add(90);
		obj.add(60);
		obj.add(30);
		obj.add(20);
		obj.add(1000);
		
		System.out.println("Size of list is:"+ obj.size());
		System.out.println("5th element is:"+ obj.get(4));
		System.out.println("6th element is:"+ obj.get(5));
		System.out.println("Average of 5th and 6th element is :"+ (obj.get(4)+obj.get(5))/2);
		
		
		

	}

}
