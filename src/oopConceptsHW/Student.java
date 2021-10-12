package oopConceptsHW;
import java.util.Scanner;

public class Student extends Person{

	int studentID;
	String major;
	double subject1;
	double subject2;
	
	public Student(){
		studentID++;
	}
	
	Student(String firstName,String lastName, int age, char gender, int studentID, String major, double subject1, double subject2) {
		
		//super to connect Person class
		super(firstName, lastName, age, gender);
		
		this.studentID = studentID;
		this.major = major;
		this.subject1 = subject1;
		this.subject2 = subject2;
		studentID++;
	}
	//user input == scanner
	public void scanner() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter student first name : ");
		firstName = scanner.next();
		scanner.nextLine();
		
		System.out.println("Enter student last name : ");
		lastName = scanner.next();
		scanner.nextLine();
		
		System.out.println("Enter student age : ");
		age = scanner.nextInt();
		
		System.out.println("Enter student gender : ");
		gender = scanner.next().charAt(0);
		
		System.out.println("Enter student major : ");
		major = scanner.next();
		scanner.nextLine();
		
		System.out.println("Enter student subject grade 1 : ");
		subject1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Enter student subject grade 2 : ");
		subject2 = scanner.nextDouble();
	
	}
	//calculation average grade
	public double calcAvrGrade() {
		double average = (this.subject1 + this.subject2)/2;
		return average;
	}
	
	public void display() {
		super.display();
		System.out.println("Student ID : " + this.studentID);
		System.out.println("Student Major : " + this.major);
		System.out.println("Student Average Grade : " + calcAvrGrade());
		
	}
	
	
	
	
	
}
