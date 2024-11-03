package com.exam.poc1;

public class Main {

	public static void main(String[] args) {
			Employee employee = new Employee(100, "John", "Doe", "male", "1990-01-10");
			Employee employee2 = new Employee(100, "John", "Doe", "male", "1990-01-10");
			System.out.println(employee.toString());
			System.out.println(employee.equals(employee2));
			System.out.println(employee.age());
	}
}
