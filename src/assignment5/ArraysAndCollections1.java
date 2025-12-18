package assignment5;


import java.util.LinkedHashMap;
import java.util.Map;

public class ArraysAndCollections1 {

	public static void main(String[] args) {
		
		//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
			
		Map<String,Float> obj= new LinkedHashMap<String,Float> ();
		
		obj.put("Delhi",1484.0f);
		obj.put("Banglore", 714f );
		obj.put("Visakhapatnam", 640f );
		obj.put("Lucknow", 631f );
		obj.put("Indore", 564f );
		
		System.out.println("total area of the 3rd and 4th cities combined is:"+" "+(obj.get("Visakhapatnam")+obj.get("Lucknow")));
		
		//Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
	

	}

}
