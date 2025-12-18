package assignment3;

class Employee{
	String Employee1="Bharath";
	String Employee2="John";
	String Employee3="Aarav";
	int Eid1=1234;
	int Eid2=1235;
	int Eid3=1236;
	
}
class EmployeeGroups{
	String []Enames=new String[3];
	int []Eids=new int[3];		
}


public class ArraysClassesObjects {

	public static void main(String[] args) {
		
		Employee obj1= new Employee();
		EmployeeGroups obj2= new EmployeeGroups();
		
		obj2.Enames[0]=obj1.Employee1;
		obj2.Enames[1]=obj1.Employee2;
		obj2.Enames[2]=obj1.Employee3;
		
		obj2.Eids[0]=obj1.Eid1;
		obj2.Eids[1]=obj1.Eid2;
		obj2.Eids[2]=obj1.Eid3;
		
		System.out.println("Name:"+obj2.Enames[0]+" "+"Eid:"+obj2.Eids[0]);
		System.out.println("Name:"+obj2.Enames[1]+" "+"Eid:"+obj2.Eids[1]);
		System.out.println("Name:"+obj2.Enames[2]+" "+"Eid:"+obj2.Eids[2]);
		

	}

}
