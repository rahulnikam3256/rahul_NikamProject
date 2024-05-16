package javapractices;



public class singleinheritanceClass {

	public static void main(String[] args) {
		
		class animal{
			String Name;
			String Type;
			String Colour;
			int Age;
			
			public void eat() {
				System.out.println("Animal is eating Food");
			}
			
		}
		class Dog extends animal{
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

		
		Dog my_Pet = new Dog();
		my_Pet.info();
		my_Pet.eat(); //The Dog class inherits the eat() method from the Animal class.

	}

}
