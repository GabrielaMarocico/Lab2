package main;

import animal.*;

import java.util.Scanner;

import exceptions.AnimalException;

//import packages.StringClass;

/**
 * 
 * @author gby
 * 
 *         This the main class of the project. It is also the entry point of the
 *         application.
 *
 */

public class Main {
	/**
	 * The entry point to the project
	 *
	 * @param args
	 *            The arguments to the executable
	 * @throws AnimalException 
	 */
	
	
	public static void main(String[] args) throws AnimalException {
		
		Scanner keyb = new Scanner(System.in);
		
		/*System.out.println("My first program.");
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

		/*System.out.print("Scrieti ceva:");
		String msg = keyb.nextLine();

		StringClass s3 = new StringClass(msg);
		s3.print();*/

		//AnimalSalbatic ac=new AnimalSalbatic("Lup");
		//ac.print();
		
		Animal aa=new AnimalDomestic("Lisa");
		aa.print();
		
		System.out.println();
		
		AnimalSalbatic as=new AnimalSalbatic("Vulpe");
		as.print();

		keyb.close();
	}
}
