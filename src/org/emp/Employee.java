package org.emp;
import java.util.Scanner;
public class Employee {
	private void empID() {
		System.out.println("Enter your Employee ID");
		Scanner s=new Scanner(System.in);
		int empid = s.nextInt();
		System.out.println("Emplyee ID is " +empid);
		//System.out.println("Employee ID is 123");
	}
	private void empName() {
		System.out.println("Enter the Employee Name is Vignesh");
	}
	private void empDob() {
		System.out.println("Employee DOB is 18.10.1992");
	}
	private void empPhone() {
		System.out.println("Employee phone number is 123456789");
	}
	private void empMail() {
        System.out.println("Employee mail is xyz@gmail.com");    
	}
	private void empAddress() {
		System.out.println("Employee address is 15, Krishna street, madurai");
	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empID();
	//e.empName();
	//e.empDob();
	//e.empPhone();
	//e.empMail();
	//e.empAddress();
	}
}
 