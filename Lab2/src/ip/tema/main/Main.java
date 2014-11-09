package ip.tema.main;

import ip.tema.animal.Animal;

import ip.tema.animal.AnimalDomestic;

import ip.tema.animal.AnimalSalbatic;

import java.util.Scanner;

import ip.tema.exceptions.AnimalException;

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

		
		/**
		 * reading from keyboard
		 */
		Scanner keyb = new Scanner(System.in);

		/*
		 * System.out.println("My first program."); System.out.println();
		 * 
		 * System.out.println("\t\tString 1"); StringClass s1 = new
		 * StringClass(); s1.print(); s1.setContent("S1 is now initialized.");
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("\t\tString 2"); StringClass s2 = new
		 * StringClass("S2 is initialized."); s2.print();
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("\t\tString 3");
		 * 
		 * /** reading from keyboard
		 */

		/*
		 * System.out.print("Scrieti ceva:"); String msg = keyb.nextLine();
		 * 
		 * StringClass s3 = new StringClass(msg); s3.print();
		 */

		Animal a1 = new AnimalDomestic("Lisa");

		if (a1.isHungry() == true)
			((AnimalDomestic) a1).feedAnimal();

		a1.print();

		System.out.println();

		AnimalSalbatic a2 = new AnimalSalbatic("Vulpe");

		if (a2.isHungry() == true)
			a2.feedAnimal();

		a2.print();

		keyb.close();
	}
}
