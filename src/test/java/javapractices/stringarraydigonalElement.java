package javapractices;

public class stringarraydigonalElement {

	public static void main(String[] args) {
		int arr[][] = { {10,20,30},
			      		{40,50,60},
			      		{70,80,90} };
		int sum = 0;
		for (int i= 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				if (i ==j) {
					sum =sum + arr[i][j];
				}
			}
		}System.out.println("Sum of Digonal Elements Are: "+sum);


	}

}
