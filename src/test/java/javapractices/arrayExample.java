package javapractices;

public class arrayExample {

	public static void main(String[] args) {
		
		int a;
		
		// array declaration 
		int empid [];
		
		// array declaration and initialization
		int empId []=new int[5];
		
		// value storing inside array		
		empId [0]= 101;
		empId [1]= 102;
		empId [2]= 103;
		empId [3]= 104;
		empId [4]= 105;
		
		//Accessing elements from array.
		System.out.println("Accessing elements from array:");
		System.out.println(empId [0]);
		System.out.println(empId [1]);
		System.out.println(empId [2]);
		System.out.println(empId [3]);
		System.out.println(empId [4]);
		
		// find length of array
		System.out.println("Length of array is:"+empId.length);
		
		

	}

}
