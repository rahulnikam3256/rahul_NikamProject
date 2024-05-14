package javapractices;

public class stringarrayExample {

	public static void main(String[] args) {
		String str[] = {"Amit", "Sunil", "Diksha", "Madhuri", "Diksha", "Neha", "Diksha"};
		
		int j = 0; // counter veriable
		
		for (int i = 0; i< str.length; i++) {
			if (str[i] == "Diksha"){
					j++;
			}
		}System.out.println("Occurrence of Diksha is: " +j);
					

	}

}
