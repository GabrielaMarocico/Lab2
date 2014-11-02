package ip.tema.exceptions;

/**
 * 
 * @author gby
 * 
 *         Aceasta este o clasa ce extinde clasa Exception si va fi aruncata de
 *         clasele AnimalCarnivor si AnimalIerbivor
 *
 */

public class AnimalException extends Exception {
	public AnimalException(String message) {
		super(message);
	}
}