// 2.Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. 
// ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound."
// ● The DogandCatclasses should override this method to print "TheCat/The dog meows/barks" respectively. 
// ● The program should allow the user to create and display objects of each class. [Hint:Use multilevel inheritance]


class Animal{
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("The Dog  barks.");
	}
}

class Cat extends Dog{
	public void makeSound() {
		System.out.println("The Cat meows.");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.makeSound();
		
		Dog d1 = new Dog();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();
		
		
	}

}

/* Output:
 
The animal makes a sound.
The Dog  barks.
The Cat meows.
 */
