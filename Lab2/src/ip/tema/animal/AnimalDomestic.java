package ip.tema.animal;

import ip.tema.exceptions.AnimalException;

import ip.tema.interfaces.IAnimal;

/**
 * 
 * @author gby
 *
 *         Aceasta este o clasa AnimalIerbivor care mosteneste clasa Animal si
 *         implementeaza interfata IAnimal
 */

public class AnimalDomestic extends Animal implements IAnimal {

	private String numeStapan;
	private long telefonStapan;
	private boolean vaccinat;

	/**
	 * Constructor - primeste ca parametru numele animalului - cere
	 * utilizatorului sa introduca datele despre animal
	 * 
	 * @numeAnimal - numele animalului
	 */
	public AnimalDomestic(String numeAnimal) {

		super(numeAnimal);

		System.out.print("Nume stapan: ");
		String numeSt = keyb.next();

		System.out.print("Numar telefon stapan: ");
		long tel = keyb.nextLong();

		System.out.print("Este vaccinat?(true/false) ");
		boolean ifVaccin = keyb.nextBoolean();

		System.out.println();

		this.numeStapan = numeSt;
		this.telefonStapan = tel;
		this.vaccinat = ifVaccin;
		this.setHungry(true);
	}

	/* Verifica daca animalul traieste sau nu */
	@Override
	public boolean StillAlive() {
		return isAlive();
	}

	/* Verifica daca animalului is este foame */
	@Override
	public boolean needFood() {
		return isHungry();
	}

	/* Hraneste animalul */
	@Override
	public void feedAnimal() {
		this.setHungry(false);
	}

	/*
	 * Verifica daca animalul este Domestic, si returneaza true, iar in caz
	 * contrat, returneaza false
	 */
	@Override
	public boolean ifpet() {
		return true;
	}

	/* Printeaza informatiile animalului */
	@Override
	public void print() throws AnimalException {
		System.out.println("\tInformatii animal:");

		if (this.getNumeAnimal() == null)
			throw new AnimalException("Animal's name is invalid!");

		if (numeStapan == null)
			throw new AnimalException("Owner's name is invalid!");

		if (this.getOrigine() == null)
			throw new AnimalException("Country's name is invalid!");

		if (this.getTelefonStapan() == 0)
			throw new AnimalException("Phone number is invalid!");

		System.out.println("Nume: " + this.getNumeAnimal());

		String alivee = "";
		if (isAlive() == true)
			alivee = "da";
		else
			alivee = "nu";

		System.out.println("Traieste: " + alivee);
		System.out.println("Origine: " + this.getOrigine());

		String ifVaccinat = "";
		if (vaccinat == true)
			ifVaccinat = "este";
		else
			ifVaccinat = "nu este";

		if (ifpet() == true) {
			System.out.println("Stapanul animalului se numeste " + numeStapan
					+ ", poate fi contactat la numarul " + telefonStapan
					+ " si " + ifVaccinat + " vaccinat");
		}
	}

	public String getNumeStapan() {
		return numeStapan;
	}

	public void setNumeStapan(String numeStapan) {
		this.numeStapan = numeStapan;
	}

	public long getTelefonStapan() {
		return telefonStapan;
	}

	public void setTelefonStapan(long telefonStapan) {
		this.telefonStapan = telefonStapan;
	}

	public boolean isVaccinat() {
		return vaccinat;
	}

	public void setVaccinat(boolean vaccinat) {
		this.vaccinat = vaccinat;
	}

}
