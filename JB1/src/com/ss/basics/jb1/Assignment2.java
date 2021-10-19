/**
 * 
 */
package com.ss.basics.jb1;

import java.util.Scanner; // For user input
import java.lang.Math; // For random number

/**
 * @author mmore
 *
 */

public class Assignment2 {
	public static void main(String args[]) {
		// 0. Initializations
		int numOfAttempts = 5;
		
		// 1. Program generates a random number
		int upperBound = 100;
		int lowerBound = 1;
		int range = upperBound - lowerBound + 1;
		
		int randomNumber = (int)(Math.random() * range) + lowerBound; // Generates random integer from 1 - 100
				
		// 2. With five attempts, the user must correctly guess
		Scanner scannerObj = new Scanner(System.in); // Create scanner object to read user input
		int userInteger = 0;
		
		while(numOfAttempts > 0) {
			System.out.print("Guess a number from 1-100: ");
			userInteger = scannerObj.nextInt();	
			
			if (isValid(randomNumber, userInteger)) {
				System.out.println("Correct! The answer was " + randomNumber + ". Goodbye.");
				scannerObj.close();
				return;
			}
			else {
				System.out.println("Wrong answer! Please keep guessing.");
			}
			
			numOfAttempts--; // Keep decrementing the number of attempts the user has left until 0
		}
	
		scannerObj.close();
		System.out.println("Sorry, the correct answer was " + randomNumber + ". Goodbye.");
		return;
	}
	
	/*
	 * This method takes the randomly generated integer and the user input integer.
	 * If the user's guess is within the accepted range, then return true;
	 * else return false.
	 */
	public static boolean isValid(int randomNumber, int userInteger) {
		if((randomNumber - 11 < userInteger) && (userInteger < randomNumber + 11))
			return true;
		else
			return false;
	}
}
