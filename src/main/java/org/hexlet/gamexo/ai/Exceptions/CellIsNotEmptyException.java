package main.java.org.hexlet.gamexo.ai.Exceptions;

/**
 * User: Oleg
 * Date: 09.09.13
 * Time: 16:52
 */

// Исключение для случая, если поле для хода занято.
public class CellIsNotEmptyException extends Exception{
	public CellIsNotEmptyException(String ex) {
		super(ex);
	}
}
