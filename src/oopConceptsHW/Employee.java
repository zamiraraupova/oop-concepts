package oopConceptsHW;

import java.util.Scanner;

public class Employee extends Person implements PersonInterface{

	int e_id;
	double salary;
	String position;
	int bonus;
	
	public Employee() {
		e_id++;
	}
	
	Employee(int e_id, double salary, String position, int bonus, String firstName,String lastName, int age, char gender){
		
		super(firstName, lastName, age, gender);
		
		this.e_id = e_id;
		this.salary = salary;
		this.position = position;
		this.bonus = bonus;
	}
	
public void scanner() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee first name : ");
		firstName = scanner.next();
		scanner.nextLine();
		
		System.out.println("Enter Employee last name : ");
		lastName = scanner.next();
		scanner.nextLine();
		
		System.out.println("Enter Employee age : ");
		age = scanner.nextInt();
		
		System.out.println("Enter Employee gender : ");
		gender = scanner.next().charAt(0);
		
		System.out.println("Enter Employee position : ");
		position = scanner.next();
		scanner.nextLine();
		
		System.out.println("Enter Employee salary : ");
		salary = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Enter Employee bonus : ");
		bonus = scanner.nextInt();
		scanner.nextLine();
		
	}

	//calculation salary ==== here I am working with PersonInterface
    // changing an int to a double
public double calculate(int bonus) {
	
	double netsalary = bonus + this.salary;
	return netsalary;
	
}

	public void display() {
		super.display();
		System.out.println("Employee ID : " + this.e_id);
		System.out.println("Employee position : " + this.position);
		System.out.println("Employee Salary : $" + calculate(this.bonus));	
	}
		
}
