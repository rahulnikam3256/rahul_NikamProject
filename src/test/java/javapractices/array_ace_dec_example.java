package javapractices;

public class array_ace_dec_example {

	public static void main(String[] args) {
		
		// declaration+initialization+value assignments
		int array[]= {100,40,20,500,300,800,900,85};
		
		// array print
		System.out.println("Orignal array is:");
		 for (int i = 0; i< array.length; i++) {
			 System.out.print(array[i]+"\t");	 
		 }System.out.println();
		 
		 // Ascending order
		 for (int i = 0; i< array.length; i++) {
			 for (int j= i+1; j< array.length; j++) {
				 if (array[i]> array [j]) {
					 int R = array[i];
					 array[i]= array[j];
					 array[j]= R;
					 
				 }
			 }
			 
		 }
		// find Largest element from array
		 System.out.println("Largest element from array is: " + array[(array.length - 1)]);
		 
		// find Second Largest element from array
		 System.out.println("\nSecond Largest element from array is: " + array[(array.length - 2)]);
		 
		// find Smallest element from array
		 System.out.println("\nsmallest element from array is: " + array[0]);
		 
		// find Smallest element from array
		 System.out.println("\nSecond samllest element from array is: " + array[1]);
		 
		 // print Ascending order elements from array
		 
		 System.out.println("\nAscending order elements from array is :");
		 for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+"\t");
				}System.out.println();
				
		
		 
		
		//  Descending order
				 for (int i = 0; i< array.length-1; i++) {
					 for (int j= 0; j< array.length-i-1; j++) {
						 if (array[j]< array [j+1]) {
							 int R = array[j];
							 array[j]= array[j+1];
							 array[j+1]= R;
						 }
					 }
				 }
			// print Descending order elements from array
				 
			System.out.println("\nDescending order elements from array is :");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i]+"\t");
				}System.out.println();
				
			// find Smallest element from array
			System.out.println("\nsmallest element from array is: " + array[(array.length - 1)]);
				 
			// find Second Largest element from array
			 System.out.println("\nSecond smallest element from array is: " + array[(array.length - 2)]);
				 
			// find largest element from array
			 System.out.println("\nlargest element from array is: " + array[0]);
				 
			// find largest element from array
			 System.out.println("\nSecond largest element from array is: " + array[1]);
				 
	}

}
