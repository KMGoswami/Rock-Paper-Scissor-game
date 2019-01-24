package rps;

/**
 *	This a class containing main method.
 * It will start the game. 
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 **/

public class PlayGame {

	public static void main(String[] args){
		
		/*
		 * Elevator Statement:
		 * Computer and Human classes are extended to Player class. RockPaperScissors is
		 * extended to Game which is implemented to Playable. The object of Player in Game 
		 * class makes interaction of every class possible.
		 */
		
		/** An object of Playable initialized with a number of rounds **/
		Playable playable = new RockPaperScissors(3);
		playable.play();
		playable.displayResults();
		
	}

}
