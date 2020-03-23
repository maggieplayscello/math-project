package com.techelevator;

import java.util.Scanner;

public class MathProblem {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Would you like to do a math problem?");
		String yesOrNo = input.nextLine();
		
		while (yesOrNo.equalsIgnoreCase("Y")) {
			

			int a = (int) (Math.random() * 100);
			int b = (int) (Math.random() * 100);
			System.out.println(a + " + " + b + " =");
			double answer = a + b;

			double userAnswer = Double.parseDouble(input.nextLine());
			if (answer == userAnswer) {
				System.out.println("That's correct! Here's another:");
			} else {
				while (answer != userAnswer) {
					System.out.println("That is incorrect. Guess again:");
					double tryAgain = Double.parseDouble(input.nextLine());
					if (tryAgain == answer) {
						System.out.println("That's correct! Here's another:");
						break;
					}
					continue;
				}
			}
		} System.out.println("Ok, goodbye!");
		input.close();
	}
}
