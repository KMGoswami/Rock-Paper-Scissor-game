package rps;

import java.util.Scanner;

/**
 * This class will prompt the user to play the move
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 **/

public class Human extends Player {
	/** An object of Scanner class for the user input**/
	private Scanner in;
	/** At this point, only one object of Scanner exist **/
	
	public Human(Scanner in) {
		super(in.next());
		this.in = in;
	}

	//@Override
	/**
	 * This method will prompt the user and store the move of player.
	 */
	
	public boolean takeTurn(){
		
		/*
		 * If Human class does not implement takeTurn() it will create an error
		 * Because takeTurn() is an abstract method in parent class Player.
		 */
		
		in = new Scanner(System.in);
		
		/** A boolean loop-control variable**/
		boolean control = false;
		do {
			
			System.out.println(name + ", it's your turn (Enter R for Rock, P for Paper, "
					+ "S for Scissors,L for Lizard , SP for Spock or Q to quit):");
			
			String playerMove = in.next().toUpperCase();
		
			control = true;
			
			switch (playerMove) {
			case "Q":
					return false;
			case "S":
			case "R":
			case "P":
			case "L":
				lastMove = HandSign.getHandSign(playerMove.substring(0,1));
				System.out.println(name + " played " + lastMove.name());
				
				break;
				
			case "SP":
				lastMove = HandSign.getHandSign(playerMove.substring(0,2));
				System.out.println(name + " played " + lastMove.name());
				
				break;
				
			default:
				System.out.println("Invalid input, please try again…");
				control = false;
				break;
			}
			
			 return true;
		}while(!control);
	}
	


}
