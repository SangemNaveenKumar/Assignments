package assignment6;

public class ArraysDataTypesOperators {

	public static void main(String[] args) {
		
		String Names[]= {"Suresh","Mahesh","Naresh"};
		int Marks[]= {75,80,82};
		
		int UpdatedMarks[] = new int[Marks.length];
		
		UpdatedMarks[0]=Marks[0]+10;
		UpdatedMarks[1]=Marks[1]+10;
		UpdatedMarks[2]=Marks[2]+10;
		
		System.out.println("Updated Marks:");
		System.out.println(Names[0]+": "+UpdatedMarks[0]);
		System.out.println(Names[1]+": "+UpdatedMarks[1]);
		System.out.println(Names[2]+": "+UpdatedMarks[2]);
		System.out.println("Average Marks:"+(UpdatedMarks[0]+UpdatedMarks[1]+UpdatedMarks[2])/Marks.length);
		
		
//		for (int i=0;i<Marks.length;i++) {
//			UpdatedMarks[i]=Marks[i]+10;
//		}
//		
//		System.out.println("Updated Marks:");
//		for (int i=0;i<Marks.length;i++) {
//			System.out.println(Names[i]+": "+UpdatedMarks[i]);
//		}
//		System.out.println("Average Marks:"+(UpdatedMarks[0]+UpdatedMarks[1]+UpdatedMarks[2])/Marks.length);

	}

}
