package animal;

import java.util.Scanner;

import exceptions.AnimalException;

/**
 * 
 * @author gby
 *
 *         Aceasta este o clasa abstracta
 */

public abstract class Animal {
	private String numeAnimal;
	private boolean alive;
	private String origine;

	Scanner keyb = new Scanner(System.in);

	public abstract void print() throws AnimalException;

	public abstract boolean ifpet();

	public Animal(String numeAnimal) {

		System.out.println("\tInformatii " + numeAnimal + " :");
		System.out.print("Traieste?(true/false) ");
		boolean alive = keyb.nextBoolean();

		System.out.print("Tara de origine: ");
		String origine = keyb.next();

		this.setNumeAnimal(numeAnimal);
		this.setAlive(alive);
		this.setOrigine(origine);
	}

	public String getNumeAnimal() {
		return numeAnimal;
	}

	public void setNumeAnimal(String numeAnimal) {
		this.numeAnimal = numeAnimal;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

}
