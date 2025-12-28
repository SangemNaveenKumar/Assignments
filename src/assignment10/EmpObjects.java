package assignment10;
import java.util.LinkedHashMap;
import java.util.Map;
public class EmpObjects {

	public static void main(String[] args) {
		
		Emp E1= new Emp("Alice Johnson",75000.0,5.1f,4.2f);
		Emp E2= new Emp("Bob Smith",68000.0,3.2f,3.8f);
		Emp E3= new Emp("Carol Davis",82000.0,7.1f,4.5f);
		Emp E4= new Emp("David Brown",90000.0,10.2f,2.5f);
		Emp E5= new Emp("Eva Green",60000.0,2.4f,3.5f);
		
		
		Map <String,Double> emp= new LinkedHashMap<String,Double>();
		emp.put(E1.Name,E1.hike());
		emp.put(E2.Name,E2.hike());
		emp.put(E3.Name,E3.hike());
		emp.put(E4.Name,E4.hike());
		emp.put(E5.Name,E5.hike());
		
		System.out.println(emp);
	}

}
