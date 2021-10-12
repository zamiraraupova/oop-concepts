package oopConceptsHW;

import java.util.Scanner;
// encapsulation with setters and setters

public class Person1{

	private int ssn;
	private int phone;
	
	
	//getter and setter
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn; 
	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone; 
	}
	
public void scanner() {
		
		Scanner scanner = new Scanner(System.in);
		
		Person1 person = new Person1();
		
		System.out.println("Enter Person1 SSN : ");
		person.setSsn(scanner.nextInt());
		
		System.out.println("Enter Person1 phone : ");
		person.setPhone(scanner.nextInt());
			
		System.out.println("Person1 SSN :" + person.getSsn());
	    System.out.println("Person1 Phone :" + person.getPhone());
	}
	
	void display() {
	
	}

}
