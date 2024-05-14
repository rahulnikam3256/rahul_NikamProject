package javapractices;

public class stringClassProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome to Codemind";
		
		//  reverse given String
		
		for(int i =s.length()-1; i>=0; i-- ) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println("\n***************************************");
		
		// reverse given String words
		// emocleW ot dnimedoc
		
		String arr[] = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String s2 = arr[i];
			for (int j = s2.length() - 1; j >= 0; j--) {
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
			
		}	System.out.println("\n************************************");
		
		// find capital letters count
		
		String s3 = "WelcoMe to CodemiNd";
		for (int i= 0; i<s3.length(); i++) {
			char m =s3.charAt(i);
			if(m>='A'&& m<='Z') {
				System.out.println(m);
			}
		}
		System.out.println("*********************************");
		
		//find count of 'e'
		
		int count = 0;
		for(int i = 0; i<s3.length(); i++) {
			char p = s3.charAt(i);
			if(p=='e') {
				count = count +1;
				
			}
			
		}System.out.println("Count of e is: "+count);
		
		System.out.println("\n**************************************");
		
		
		String x = "1234$#%#$%$DDFGaAS#$678kLKDN123";

		System.out.println(x.replaceAll("[12]", "")); // remove in string 12

		System.out.println(x.replaceAll("[^12]", "")); //remove all char in string but only remain 12

		System.out.println(x.replaceAll("[0-9]", "")); // remove all number from string

		System.out.println(x.replaceAll("[^0-9]", ""));//remove to all from given string remain only numbers

		System.out.println(x.replaceAll("[^0-9a-zA-Z]", "")); //remove to all from given string but remain only numbers & capital & small letters

		System.out.println(x.replaceAll("[0-9a-zA-Z]", "")); //remove all number, letters from string

		System.out.println(x.replaceAll("[0-9a-zA-Z%]", ""));//remove to all from given string but remain only numbers & capital & small letters & '%'

		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		int sum = 0;

		for (int i = 0; i < x.length(); i++) {
			char z = x.charAt(i);

			sum = sum + Character.getNumericValue(z);

		}
		System.out.println("Sum of all digits from given String is : " + sum);
		System.out.println("Number of characters in given String is : " + x.length());
		
	}
	
	
}


