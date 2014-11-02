package Animal;

/**
 * 
 * @author gby
 *
 *         Aceasta este o clasa abstracta
 */

public abstract class Animal {
	/* Numele animalului */
	String numeAnimal;
	boolean alive;
	String origineContinent;
	String hrana;

	public abstract String food();

	public abstract void print();

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

	public String getOrigineContinent() {
		return origineContinent;
	}

	public void setOrigineContinent(String origineContinent) {
		this.origineContinent = origineContinent;
	}

	public String getHrana() {
		return hrana;
	}

	public void setHrana(String hrana) {
		this.hrana = hrana;
	}

}
