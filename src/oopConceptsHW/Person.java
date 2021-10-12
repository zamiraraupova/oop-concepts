//1. Create a Person class that should have a parameterized constructor to make objects. 
//
//2. Create 2 classes Employee and Student as subclasses of the Person  class as a super class.
//
//3. To create objects for the  2 subclasses mentioned above, take input from the user 
//   (Do not put the hard coded  values in the variables).
//
//4. Create another class as Person1 and declare private properties in it. 
//   Also create setter and getter methods in this class as public methods.
//
//5. To test encapsulation create objects for this class with the user input values.
//
//6. Create an Interface PersonInterface. Declare one static final variable for the
//   organization name and create 2 abstract methods in it. One should be calculate 
//   which should take one int argument and should return a double value. The other 
//   method should be of your choice.
//-------------------------------------------------------------------------------------------
		
package oopConceptsHW;

public class Person {
	
	// declare variables
	String firstName;
	String lastName;
	int age;
	char gender;
	
	
	//empty constructor 
	public Person() {
		
	}
	
	//parametrized constructor
	public Person(String firstName, String lastName, int age, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;	
	}
	
	
	void display() {
		System.out.println("First name : " + this.firstName);
		System.out.println("Last name : " + this.lastName);
		System.out.println("Age : " + this.age);
		System.out.println("Gender : " + this.gender);
		
	}
	

}
