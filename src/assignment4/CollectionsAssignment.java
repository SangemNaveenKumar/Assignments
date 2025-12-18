package assignment4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionsAssignment {

	public static void main(String[] args) {
		
		
		//Map<Map<String>,Map<String>> StudentDetails32= new LinkedHashMap<Map<String>,Map<String>> ();
		Map<String,String> StudentDetails1= new LinkedHashMap<String,String>();
		
		StudentDetails1.put("Name","John Doe");
		StudentDetails1.put("Age","Twenty");
		StudentDetails1.put("Gender","Male");
		StudentDetails1.put("Roll Number","SBA12345");
		StudentDetails1.put("Grade","A++");
		StudentDetails1.put("Major","Computer Science");
		StudentDetails1.put("GPA","A3.8");
		StudentDetails1.put("Email", "john@example.com");
		StudentDetails1.put("PAN Number","SDF6543210");
		StudentDetails1.put("Address","123 Elm St");
		
		
		Map<String,String> StudentDetails2= new LinkedHashMap<String,String>();
		
		StudentDetails2.put("Name","Jane Smith");
		StudentDetails2.put("Age","TwentyOne");
		StudentDetails2.put("Gender","Female");
		StudentDetails2.put("Roll Number","SBA12346");
		StudentDetails2.put("Grade","B+");
		StudentDetails2.put("Major","Mathematics");
		StudentDetails2.put("GPA","A3.5");
		StudentDetails2.put("Email", "jane@example.com");
		StudentDetails2.put("PAN Number","REW6543211");
		StudentDetails2.put("Address","456 Oak St");
		
		Map<String,String> StudentDetails3= new LinkedHashMap<String,String>();
		
		StudentDetails3.put("Name","Mike Brown");
		StudentDetails3.put("Age","TwentyTwo");
		StudentDetails3.put("Gender","Male");
		StudentDetails3.put("Roll Number","SBA12347");
		StudentDetails3.put("Grade","A+");
		StudentDetails3.put("Major","Computer Science");
		StudentDetails3.put("GPA","A3.9");
		StudentDetails3.put("Email", "mike@example.com");
		StudentDetails3.put("PAN Number","TYR6543212");
		StudentDetails3.put("Address","789 Pine St");
		
		List<Map<String,String>> students= new ArrayList<Map<String,String>>();
		students.add(StudentDetails1);
		students.add(StudentDetails2);
		students.add(StudentDetails3);
		//System.out.println(students);
		
		
		Map<String,String> EmployeeDetails1= new LinkedHashMap<String,String>();

		EmployeeDetails1.put("Employee ID","E001");
		EmployeeDetails1.put("Name","Alice Green");
		EmployeeDetails1.put("Age","Thirty");
		EmployeeDetails1.put("Gender","Female");
		EmployeeDetails1.put("Department","Engineering");
		EmployeeDetails1.put("Position","Software Engineer");
		EmployeeDetails1.put("Salary","75K Pounds");
		EmployeeDetails1.put("Email", "alice@example.com");
		EmployeeDetails1.put("PAN Number","SDF6543210");
		Map<String,String> EmployeeDetails2= new LinkedHashMap<String,String>();
		EmployeeDetails2.put("Employee ID","E002");
		EmployeeDetails2.put("Name","Bob Johnson");
		EmployeeDetails2.put("Age","Thirty Five");
		EmployeeDetails2.put("Gender","Male");
		EmployeeDetails2.put("Department","Marketing");
		EmployeeDetails2.put("Position","Marketing Manager");
		EmployeeDetails2.put("Salary","85K Pounds");
		EmployeeDetails2.put("Email", "bob@example.com");
		EmployeeDetails2.put("PAN Number","REW6543211");
		
		Map<String,String> EmployeeDetails3= new LinkedHashMap<String,String>();
		EmployeeDetails3.put("Employee ID","E003");
		EmployeeDetails3.put("Name","Carol White");
		EmployeeDetails3.put("Age","Twenty Eight");
		EmployeeDetails3.put("Gender","Female");
		EmployeeDetails3.put("Department","Sales");
		EmployeeDetails3.put("Position","Sales Executive");
		EmployeeDetails3.put("Salary","65K Pounds");
		EmployeeDetails3.put("Email", "carol@example.com");
		EmployeeDetails3.put("PAN Number","TYR6543212");
				
		List<Map<String,String>> Employees= new ArrayList<Map<String,String>>();
		Employees.add(EmployeeDetails1);
		Employees.add(EmployeeDetails2);
		Employees.add(EmployeeDetails3);
		
		//System.out.println(Employees);
		
		Map<String,String> P1= new LinkedHashMap<String,String>();
		P1.put("Product ID","P001");
		P1.put("Name","Laptop");
		P1.put("Category","Electronics");
		P1.put("Price","12K Pounds");
		P1.put("Stock Quantity","Not Available");
		P1.put("Supplier","Tech Supplies");
		P1.put("Warranty","2 years");
		P1.put("Rating", "4.5 Stars");
		P1.put("Manufacturing Date","Aug 2023");
		P1.put("Expiry Date","Aug 2028");
		
		Map<String,String> P2= new LinkedHashMap<String,String>();
		P2.put("Product ID","P002");
		P2.put("Name","Desk Chair");
		P2.put("Category","Furniture");
		P2.put("Price","150K Pounds");
		P2.put("Stock Quantity","Two");
		P2.put("Supplier","Office Depot");
		P2.put("Warranty","1 year");
		P2.put("Rating", "4 Stars");
		P2.put("Manufacturing Date","Sep 2024");
		P2.put("Expiry Date","N/A");
		
		Map<String,String> P3= new LinkedHashMap<String,String>();
		P3.put("Product ID","P003");
		P3.put("Name","Coffee Maker");
		P3.put("Category","Kitchen");
		P3.put("Price","75 Pounds");
		P3.put("Stock Quantity","Two Hundred");
		P3.put("Supplier","KitchenWorld");
		P3.put("Warranty","6 months");
		P3.put("Rating", "4.2 Stars");
		P3.put("Manufacturing Date","Jan 2025");
		P3.put("Expiry Date","Jan 2027");
		
		
		List<Map<String,String>> products=new ArrayList<Map<String,String>>();
		products.add(P1);
		products.add(P2);
		products.add(P3);
		
		
		Map<String,List<Map<String,String>>> Excel=new LinkedHashMap<String,List<Map<String,String>>>();
		Excel.put("Studentsdetails",students);
		Excel.put("EmployeeDetails",Employees);
		Excel.put("ProductDetails",products);
		
		
		System.out.println(Excel);
		System.out.println(Excel.get("ProductDetails").get(1).get("Supplier"));
	

		
	}

}
