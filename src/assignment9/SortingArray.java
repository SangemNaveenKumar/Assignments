package assignment9;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int arr[]= {12,34,11,36,87,98,93};
		
		int highest=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=i;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
					highest=arr[j];
					arr[j]=arr[i];
					arr[i]=highest;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second Largest in list is:"+arr[1]+"\nThird Largest in List is:"+arr[2]);
	}
}
