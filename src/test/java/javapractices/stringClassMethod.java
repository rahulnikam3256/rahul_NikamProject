package javapractices;

public class stringClassMethod {

	public static void main(String[] args) {
		
		String s = "1234$#%#$%$DDFGaAS#$678kLKDN123";
		String j = ""; // given empty string
		// Iterate through each character in the string
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);  // char at = Returns the char value at the specified index
			if (Character.isDigit(c)) {  // is digit= Determines if the specified character is a digit.
				j=j+c; // appends it to the j string. 
			}// Character is a class in java
			
		}System.out.println("Find the Numiric value in given string: "+j);
		
		
		// Convert string to char array
		char array[]=j.toCharArray();
		int sum = 0;
		
		// Iterate through each character in the array
		for(int i=0; i<array.length;i++) {
			char c = j.charAt(i); // char at = Returns the char value at the specified index. 
			if (Character.isDigit(c)){   // is digit= Determines if the specified character is a digit. 
				
				// Convert char to int and add to sum
				sum =sum+ Character.getNumericValue(c); //getNumericValue= Returns the int value 
				
			}
			
			}System.out.println("The Sume Of int value is: "+sum);
			
		}
		 

	}

