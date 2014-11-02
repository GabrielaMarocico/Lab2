package animal;

import interfaces.IAnimal;
import exceptions.AnimalException;

/**
 * 
 * @author gby
 *
 *         Aceasta este o clasa AnimalCarnivor care mosteneste clasa Animal si
 *         implementeaza interfata IAnimal
 */

public class AnimalSalbatic extends Animal implements IAnimal {

	private String numeRezervatie;

	public AnimalSalbatic(String nume) {
		super(nume);

		System.out.print("Nume rezervatie: ");
		String numeRez = keyb.next();

		this.numeRezervatie = numeRez;

	}

	@Override
	public boolean StillAlive() {
		return isAlive();
	}

	@Override
	public void print() throws AnimalException {
		System.out.println("\tInformatii animal:");
		
		if (this.getNumeAnimal() == null)
			throw new AnimalException("Animal's name is invalid!");

		if (this.getOrigine() == null)
			throw new AnimalException("Country's name is invalid!");

		if(numeRezervatie==null)
			throw new AnimalException("Rezervation's name is invalid!");
			
		System.out.println("Nume: " + this.getNumeAnimal());

		String alivee = "";
		if (isAlive() == true)
			alivee = "da";
		else
			alivee = "nu";

		System.out.println("Traieste: " + alivee);
		System.out.println("Origine: " + this.getOrigine());

		if (ifpet() == false)
			System.out.println("Acest animal poate fi gasit in rezervatia "
					+ getNumeRezervatie());
	}

	@Override
	public boolean ifpet() {
		return false;
	}

	public String getNumeRezervatie() {
		return numeRezervatie;
	}

	public void setNumeRezervatie(String numeRezervatie) {
		this.numeRezervatie = numeRezervatie;
	}

}