package com.bridgelabz.validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidator {

	public static void main(String[] args) {
		UserValidator validator = new UserValidator();
		System.out.println("Welcom to Validator");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the FirstName");
		String firstName = scanner.next();
		boolean validationStatus = validator.validateFirstName(firstName);
		System.out.println("First name validation " + validationStatus);
		System.out.println("Enter the LastName");
		String lastName = scanner.next();
		validationStatus = validator.validateLastName(lastName);
		System.out.println("Last name validation " + validationStatus);

	}

	public boolean validateFirstName(String firstName) {
		return (Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName));

	}

	public boolean validateLastName(String lastName) {
		return (Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lastName));

	}
}
