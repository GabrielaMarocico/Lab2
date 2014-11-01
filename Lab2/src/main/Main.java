package main;

import java.util.Scanner;

import string.StringClass;

/**
 * 
 * @author gby 
 * clasa Main in care am declarat obiecte de tipul StringClass
 *
 */

public class Main {
	public static void main(String[] args) {
		System.out.println("My first program.");
		System.out.println();

		System.out.println("\t\tString 1");
		StringClass s1 = new StringClass();
		s1.print();
		s1.setContent("S1 is now initialized.");

		System.out.println();

		System.out.println("\t\tString 2");
		StringClass s2 = new StringClass("S2 is initialized.");
		s2.print();

		System.out.println();

		System.out.println("\t\tString 3");

		/**
		 * reading from keyboard
		 */

		System.out.print("Scrieti ceva:");
		Scanner keyb = new Scanner(System.in);
		String msg = keyb.nextLine();

		StringClass s3 = new StringClass(msg);
		s3.print();

		keyb.close();
	}
}
