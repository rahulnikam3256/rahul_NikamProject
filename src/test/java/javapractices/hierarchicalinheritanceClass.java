package javapractices;

public class hierarchicalinheritanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		class Cat extends Animal{
			
			public void Drink() {
				System.out.println("Cat drinking a Milk");
			}
		}
	
		Cat ct = new Cat();
		ct.eat(); //The Cat class inherits the eat() method from the Animal class.
		dog dg = new dog();
		dg.eat();  //The dog class inherits the eat() method from the Animal class.
		
	}

}
