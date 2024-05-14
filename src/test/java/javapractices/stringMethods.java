package javapractices;

public class stringMethods {

	public static void main(String[] args) {
		
		// create object by using string literals
		
		String str="Welcome to Home";
		System.out.println(str);
		System.out.println("*********************************");
		
		//charAt()
		/* find char value (Returns the char value at the specified index.
		An index ranges from 0 to length() - 1. 
		The first char value of the sequence is at index 0, 
		the next at index 1,and so on, as for array indexing. )*/
		
		System.out.println("The Char Value at Index (2) is :" +str.charAt(2));
		System.out.println("The Char Value at Index (0) is :" +str.charAt(0));
		
		System.out.println("*************************");
		
		// compareTo()
		// The comparison is based on the Unicode value of each character in the strings.
		// if return value -ve : second string is big
		// if return value +ve : 1st string is big
		// if return value is zero : strings are equals
		
		String str1 = "Welcome to codemind";
		System.out.println(str.compareTo(str1));
		
		System.out.println("***********************");
		
		// concat()
		//Concatenates the specified string to the end of this string. 
		String str2 = str.concat(" at Mumbai.");
		System.out.println(str2);
		System.out.println(str.concat(" & "+str1));
		
		System.out.println("************************");
		
		// Contains()
		// Returns true if and only if this string contains the specified sequence of char values.
		System.out.println(str.contains("Welcome"));
		System.out.println(str.contains("welcome")); //string is case sensitive. 'w'is small letter
		System.out.println(str2.contains(str));
		
		System.out.println("*******************************");
		
		// ContentEquals()
		/* Compares this string to the specified CharSequence.
		The result is true if and only if this String represents 
		the same sequence of char values as the specified sequence.
		Note that if the CharSequence is a StringBuffer then the method synchronizes on it.*/
		System.out.println(str.contentEquals("Welcome"));
		
		String str3 = "Welcome to Home";
		System.out.println(str.contentEquals(str3));
		System.out.println(str.contentEquals(" to Home"));
		
		System.out.println("****************************");
		
		//EndWith()
		System.out.println(str.endsWith("Home"));
		System.out.println(str.endsWith("Welcome"));
		System.out.println(str.endsWith("me"));
		
		System.out.println("************************");
		
		//equals()
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str3));
		
		System.out.println("*****************************");
		
		//equalsignoreCase()
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.equalsIgnoreCase("welcome to home")); //ignore case sensitive 
		
		System.out.println("*****************************");
		
		// index off()
		/*Returns the index within this string of the "first occurrence" of the specified substring, 
		starting at the specified index.*/
		// calculating index left to right... 1st occurrence given
		System.out.println("index of m is: "+str.indexOf('m'));
		System.out.println("index of m in me is: "+str.indexOf("me"));
		System.out.println("index of m in me & start from indext 6 is: "+str.indexOf("me",6));//6 is a start from index
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		//lastIndexOf()
		//Returns the index within this string of the "last occurrence" of the specified character. 
		//calculating index right to left... 1st occurrence given
		System.out.println("last index of m is: "+str.lastIndexOf('m'));
		System.out.println("index of m in me is: "+str.lastIndexOf("me"));
		System.out.println("last index of m in me & start from indext 6 is: "+str.lastIndexOf("me",6));
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		//isEmpty()
		// Returns true if, and only if, string length() is 0 ,that is string is empty.
		System.out.println(str.isEmpty());
		String s = "";   // empty string s
		System.out.println(s.isEmpty());
		
		System.out.println("############################");
		
		//length()
		//Returns the length of this string.
		//The length is equal to the number of Unicode code units in the string.
		System.out.println("Length of string str is: "+str.length());
		System.out.println("Length of string s is: "+s.length());
		
		System.out.println("#################################");
		
		// trim
		// all leading and trailing space removed. (starting & ending string spaces remove)
		System.out.println(str.trim());
		String p = "  Going To   Home.     ";
		System.out.println(p.trim());
		
		System.out.println("#################################");
		
		//toUppercase
		// To convert string to Upper case
		System.out.println(str.toUpperCase());
		
		//toLowercase
		// To convert string to Lower case
		//Converts all of the characters in this String to lower case
		System.out.println(str.toLowerCase());
		
		System.out.println("#################################");
		
		//	()
		//Converts this string to a new character array.

		char array[] = str.toCharArray();
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("#################################");
		
		//substring()
		//it is slicing
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 11));
		
		System.out.println("#################################");
		
		//startsWith
		System.out.println(str.startsWith("Welcome"));
		System.out.println(str.startsWith("welcome")); // w small case
		System.out.println(str.startsWith("Home"));
		
		System.out.println("#################################");
		
		//split
		String b[]= str.split(" ");
		b = str.split("to");
		for(String str5: b) {
			System.out.println(str5);
		}
		
		System.out.println("#################################");
		
		//replace
		System.out.println(str.replace('o', 'O'));
		System.out.println(str.replace("co", "CO"));

		System.out.println(str.replaceFirst("co", "DO"));

		System.out.println(str.replaceAll("co", "PO"));

	}

}
