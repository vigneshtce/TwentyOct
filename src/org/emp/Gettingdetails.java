package org.emp;

import java.util.Scanner;

public class Gettingdetails {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the employee name");
	String name = s.next();
	System.out.println("Enter employee id");
	int id= s.nextInt();
	//System.out.println("Enter the employee D.O.B");
	System.out.println("Enter employee phone number");
	long phno = s.nextLong();
	System.out.println("Enter employee gender");
	String gen = s.next();
	System.out.println("Enter your salary");
	float salary = s.nextFloat();
	System.out.println("Enter your emailid");
	String email = s.next();
	System.out.println("Employee name is "+name);
	System.out.println("Employee id is "+id);
	System.out.println("Employee phone number is "+phno);
	System.out.println("Employee gender is"+gen);
	System.out.println("Employee salary is "+salary);
	System.out.println("Employee email id is"+email);
}
}
