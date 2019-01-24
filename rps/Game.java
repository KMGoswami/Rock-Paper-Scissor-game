package rps;
import java.util.Scanner;

/**
 *The purpose of this class to control the flow of the game.
 *It will initialize number of players and number of rounds of the game.
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 */

public abstract class Game implements Playable {

	/** The total number of rounds in the game.**/
	protected int numRounds;
	
	/** The array of the all players in the game.**/
	protected Player players[];
	
	protected Scanner in;

	/**
	 * This method will initialize the variables.
	 * @param numRoads
	 * 					The number of rounds of the game.
	 */
	public Game(int numRoads) {
		this.numRounds = numRoads;
		players = new Player[NUM_PLAYERS];
		in = new Scanner(System.in);
		players[1].takeTurn();
		/*
		 Game class implements Playable class. So, when Game class will compile,
		 Compiler first compile Playable class and initPlayers() is declared in Playable class
		 So,it will not create an error.		 
		 */
		initPlayers();
	}

	@Override
	protected void finalize() {
		try {
			in.close();
		} catch (Exception e) {
		}

	}

}
