package com.ss.basics.jb1;

public class Assignment1 {	
	public static void main(String args[]) {
		int dividerNum = 9; // Beginning number of dots to print
		
		quadrupleTriangle(); 
		printDivider(dividerNum);
		dividerNum++;
		
		printDivider(dividerNum);
		dividerNum++;
		quadrupleReverseTriangle();
		
		quadruplePyramid();
		printDivider(dividerNum);
		dividerNum++;
		
		printDivider(dividerNum);
		dividerNum++;
		quadrupleReversePyramid();
		
		return;
	}
	
	/*
	 * Method that prints out a given number of dots
	 */
	public static void printDivider(int dividerNum) {
		for(int i = 0; i < dividerNum; i++)
			System.out.print(".");
		System.out.println();
	}
	
	/*
	 * This method prints out a triangle with four rows of blocks, all with the same beginning alignment
	 */
	public static void quadrupleTriangle() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/* 
	 * This method prints out a vertically-flipped (or reverse) version of the standard quadruple triangle
	 */
	public static void quadrupleReverseTriangle() {
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * This method prints out a center-aligned pyramid. It differs from the quad triangle as not every
	 * row has the same beginning alignment -- giving the pyramid a more "equilateral" look
	 */
	public static void quadruplePyramid() {
		Integer whitespaceCounter = 5;
		
		for(int i = 1; i < 5; i++) {
			for(int w = whitespaceCounter; w > 0; w--) {
				System.out.print(" ");
			}
			whitespaceCounter--;
			
			for(int j = 0; j < (i*2 - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	/*
	 * This method prints out a vertically-flipped (or reversed) version of the quadruple pyramid
	 */
	public static void quadrupleReversePyramid() {
		Integer whitespaceCounter = 2;

		for(int i = 4; i > 0; i--) {
			for(int w = 0; w < whitespaceCounter; w++) {
				System.out.print(" ");
			}
			whitespaceCounter++;
			
			for(int j = 0; j < (i*2 - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	

}