package javapractices;

class Animal{
	String Name;
	String Type;
	String Colour;
	int Age;
	
	public void eat() {
		System.out.println("Animal is eating Food");
	}
	
}
class dog extends Animal{
	String Name = "Tom";
	String Type = "Bulldog";
	String Colour = "Black";
	int Age = 10;
	
	public void info() {
		System.out.println("My Dog Name is "+ Name);
		System.out.println("My Dog Type is "+ Type);
		System.out.println("My Dog Colour is "+ Colour);
		System.out.println("My Dog Age is "+ Age);
	}
}
class Tom extends dog {
	
	public void MyTom() {
		// TODO Auto-generated constructor stub
		System.out.println("Tom is a sweet Pet");
	}
}

public class multiIinheritanceClass {

	public static void main(String[] args) {
		Tom tm = new Tom();
		tm.eat();  //The Tom class inherits the eat() method from the Animal class.

	}

}
