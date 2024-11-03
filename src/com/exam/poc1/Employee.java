package com.exam.poc1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public record Employee (int employeeNo, String firstName,  String lastName, String gender, String dateofBirth){
	public int age() {
		if (this.dateofBirth == null || this.dateofBirth.isEmpty()) {
			return 0;
		}
		LocalDate dateNow = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dob = LocalDate.parse(this.dateofBirth, dtf);
		Period dateBetween = Period.between(dob, dateNow);
		return dateBetween.getYears();
	}
}
