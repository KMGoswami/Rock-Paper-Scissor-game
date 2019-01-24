
package rps;

/**
 * This class will contain the name of each player, player's score and last move played by the player.
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 **/
public abstract class Player {
	
	/** Name of each player **/
	protected final String name;
	
	/** The last move which was played by the player**/
	protected HandSign lastMove;
	
	/** Number of total wins of player**/
	private int wins;
	
	/** The number of total ties. It will be shared by all players.
	 * So,it should be static.
	 */
	protected static int ties = 0;
	
	public Player(String name) {
		this.name = name;
		wins = 0;
	}

	/**
	 * This method will return name of each player.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method will return the lastmove of each player.
	 */
	public HandSign getLastMove() {
		 
		return lastMove;
	}

	/**
	 * This method will return the wins of each player.
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * This method will return the ties.
	 */
	public static int getTies() {
		return ties;
	}
	
	/**
	 * This method will increase the wins by 1.
	 */
	public void win() {
		wins += 1;
	}

	/**
	 * This method will increase tie by 1. tie() method
	 * should be static.
	 */
	public static void tie() {
		ties += 1;
	}
	
	@Override
	public String toString() {
		return ("Player: " + name + "\nWins: " + wins) ;
	}
	
	public abstract boolean takeTurn();
}
