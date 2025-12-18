package assignment5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Top10MostVisitedTouristAtrtactions {

	public static void main(String[] args) {
		
		
		//Create a set of the top 10 most visited tourist attractions in the world and print out allof them and its size.
		Map<String,Long> obj= new LinkedHashMap<String,Long>();
		
		obj.put("Forbidden City", 19000000l);
		obj.put("Great Mosque of Mecca", 18000000l);
		obj.put("Giza Necropolis", 14000000l);
		obj.put("Colosseum", 13600000l);
		obj.put("Notre-Dame de Paris", 12000000l);
		obj.put("St. Peter’s Basilica", 10000000l);
		obj.put("Palace of Versailles", 9000000l);
		obj.put("Sistine Chapel,", 5000000l);
		obj.put("Taj Mahal", 4000000l);
		
		System.out.println("top 10 most visited tourist attractions in the world: "+ obj);
		

	}

}
