package oopConceptsHW;

import java.util.Scanner;

import oopConceptsHW.Employee;
import oopConceptsHW.Student;
import oopConceptsHW.Person1;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
	    Employee employee = new Employee();
		Person1 person = new Person1();	
		
		student.scanner();
		student.display();
		
		employee.scanner();
		employee.display();
		
		person.scanner();
		person.display();

	
	}

	
}
