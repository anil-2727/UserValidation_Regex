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
		boolean nameStatus = validator.validateFirstName(firstName);
		System.out.println("First name validation " + nameStatus);

	}

	public boolean validateFirstName(String firstName) {
		return (Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName));

	}

}
