package ip.tema.animal;

import java.util.Scanner;

/**
 * 
 * @author gby
 *
 *         Aceasta este o clasa abstracta
 */

public abstract class Animal {
	/* Nume animal */
	private String numeAnimal;

	/* Traieste sau nu */
	private boolean alive;

	/* Tara de origine */
	private String origine;

	private boolean hungry;

	Scanner keyb = new Scanner(System.in);

	public abstract void print() throws ip.tema.exceptions.AnimalException;

	/* Se va verifica daca animalul este Domestic sau Salbatic */
	public abstract boolean ifpet();

	/**
	 * Constructor - primeste ca parametru numele animalului - cere
	 * utilizatorului sa introduca datele despre animal
	 * 
	 * @numeAnimal - numele animalului
	 */
	public Animal(String numeAnimal) {

		System.out.println("\tInformatii " + numeAnimal + " :");
		System.out.print("Traieste?(true/false) ");
		boolean alive = keyb.nextBoolean();

		System.out.print("Tara de origine: ");
		String origine = keyb.next();

		this.setNumeAnimal(numeAnimal);
		this.setAlive(alive);
		this.setOrigine(origine);
		this.hungry = true;
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

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean isHungry) {
		this.hungry = isHungry;
	}

}
