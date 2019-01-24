
package rps;
import java.util.Random;

/**
 * This class will play the moves of the Computer.
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 **/

public class Computer extends Player {

	public Computer() {
		super("HAL");
	}
	
	/*
	 * Yes, It is possible to use the implicit default constructor of the Computer class
	 * public Computer(String name) {
		super(name);		
	}
	 */
	

	/**
	 * This method selects any random move for computer.
	 */
	public boolean takeTurn() {

		/*
		 * This is an instance variable. Scoop of this variable is limited for 
		 * only this method.It requires Java Doc because every non-private property
		 * requires a Javadoc.
		 */
		
		/** This is an object of Random class which will generate random numbers**/
		Random random = new Random();
		lastMove = HandSign.values()[random.nextInt(5)];
		
		System.out.println(name + ", it's your turn!");
		
		System.out.println(name + " played " + lastMove.name());
		
		return true;
	}

}
