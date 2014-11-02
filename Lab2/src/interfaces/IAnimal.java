package interfaces;

import exceptions.AnimalException;

/**
 * 
 * @author gby
 * 
 *         Aceasta este o interfata pentru toate animalele
 * 
 */

public interface IAnimal {
	public boolean StillAlive() throws AnimalException;
}
