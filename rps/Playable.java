package rps;

/**
 * This interface defines methods which will be implemented by 
 * other class to initialize the player and start each round.
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 **/
public interface Playable {
	/** The number of players of the game.It is a class property.**/
	public int NUM_PLAYERS = 2; 
	
	/** Access level of these methods is protected and they are abstract. **/
	void initPlayers();
	void play();
	void evaluateRound();
	void displayResults();

}
