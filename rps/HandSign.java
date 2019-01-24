package rps;

/**
 * Define an enumeration called Sign, with 5 elements, referred to as:
 * HandSign.SCISSORS, HandSign.PAPER, HandSign.ROCK, HandSign.LIZZARD , HandSign.SPOCK.
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 */
public enum HandSign {
	
	ROCK, PAPER, SCISSORS, LIZARD, SPOCK;
	
	/**
	 * Get the HandSign for a given letter.
	 * @param firstLetter 
	 * 					The letter representing a HandSign value (R, P, S,L or SP).
	 * @return 
	 * 			The HandSign value which corresponds to the given letter, otherwise return null.
	 */
	public static HandSign getHandSign(String firstLetter) {
		for (HandSign h : HandSign.values())
			if (h.name().startsWith(firstLetter.toUpperCase()))
				return h;
		return null;
	}
	
	/**
	 * This method will decide the final result of each round.
	 * @param moves
	 * 				The move which is selected byb the player
	 * @return
	 * 			The integer value which will indicate the tie or winner of the round.	
	 */
	public static int getWinner(HandSign[] moves) {
		if (moves[0] == moves[1]){
			return -1;
		}
		else if ((moves[0] == HandSign.SCISSORS && moves[1] == HandSign.PAPER) ||
				 (moves[0] == HandSign.SCISSORS && moves[1] == HandSign.LIZARD)||
				 (moves[0] == HandSign.PAPER && moves[1] == HandSign.ROCK) ||
				 (moves[0] == HandSign.PAPER && moves[1] == HandSign.SPOCK)||
				 (moves[0] == HandSign.ROCK && moves[1] == HandSign.SCISSORS) ||
				 (moves[0] == HandSign.ROCK && moves[1] == HandSign.LIZARD)||
				 (moves[0] == HandSign.LIZARD && moves[1] == HandSign.SPOCK)||
				 (moves[0] == HandSign.LIZARD && moves[1] == HandSign.PAPER)||
				 (moves[0] == HandSign.SPOCK && moves[1] == HandSign.SCISSORS)||
				 (moves[0] == HandSign.SPOCK && moves[1] == HandSign.ROCK)) {
			return 0;
		} 
		else {
			return 1;
		}
	}
}
