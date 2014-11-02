package animal;

import exceptions.AnimalException;
import interfaces.IAnimal;

/**
 * 
 * @author gby
 *
 *         Aceasta este o clasa AnimalIerbivor care mosteneste clasa Animal si
 *         implementeaza interfata IAnimal
 */

public class AnimalIerbivor extends Animal implements IAnimal {

	@Override
	public boolean StillAlive() throws AnimalException {
		return isAlive();
	}

	@Override
	public String food() {
		return food();
	}

	@Override
	public void print() {
		System.out.println("");
	}

}
