package assignment2;

public class MultiDimensionalArray {

	public static void main(String[] args) {
				
		/***
		 * Semester Subject 1 Subject 2 Subject 3 Subject 4 Subject 5 Subject 6
Sem 1 Mathematics I Physics Chemistry Computer Programming Engineering Drawing Basic Electrical Eng.
		Status(Marks) Pass(78) Pass(85) Fail(21) Pass(74) Pass(88) Pass(79)
		
Sem 2 Mathematics II Mechanics Environmental Sci. Basic Electronics Engineering Physics Engineering Graphics
		Status(Marks) Pass(82) Pass(77) Pass(93) Fail(19) Fail(24) Pass(90)
		
Sem 3 Data Structures Discrete Mathematics Digital Electronics Operating Systems Signals and Systems Object-Oriented Prog.
	Status(Marks) Pass(88 Pass(81) Pass(76) Fail(32) Pass(85) Pass(78)
	
Sem 4 Algorithms Computer Networks Database Systems Microprocessors Communication Eng. Software Engineering
		Status(Marks) Pass(91) Pass(73) Fail(19) Pass(80) Pass(76) Pass(87)
		
Sem 5 Probability & Stats Machine Learning Compiler Design Theory of Computation Embedded Systems Computer Graphics
		Status(Marks) Pass(86) Pass(88) Pass(84) Pass(95) Pass(73) Pass(90)
		 ***/		
		
		String [][][]multiDimensionalArray= {
				{
					{"Mathematics I", "Physics" ,"Chemistry" ,"Computer Programming" ,"Engineering Drawing" ,"Basic Electrical Eng"},
					{"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
				},
				{
					{"Mathematics II" ,"Mechanics Environmental" ,"Sci. Basic Electronics" ,"Engineering Physics" ,"Engineering Graphics"},
					{"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"} 
				},
				{
					{"Data Structures" ,"Discrete Mathematics", "Digital Electronics" ,"Operating Systems", "Signals and Systems", "Object-Oriented Prog"},
					{"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}					 
				},
				{
					{"Algorithms" ,"Computer Networks", "Database Systems" ,"Microprocessors" ,"Communication Eng." ,"Software Engineering"},
					{"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
				},
				{
					{"Probability & Stats", "Machine Learning" ,"Compiler Design" ,"Theory of Computation" ,"Embedded Systems", "Computer Graphics"},
					{"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"}
				}};
		
//		2. From the array:
//			o Print Semester 2 Subject 4 and Subject 5 names.
//			o Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		
		System.out.println("Semester 2 Subject 4 and Subject 5 names: "+multiDimensionalArray[1][0][3]+","+multiDimensionalArray[1][0][4]);
		System.out.println("Status/Marks of Semester 4 Subject 3 : "+multiDimensionalArray[3][1][2]);
		System.out.println("Status/Marks of Semester 4 Subject 6: "+multiDimensionalArray[3][1][5]);
		
		
	}}
		
		
		

