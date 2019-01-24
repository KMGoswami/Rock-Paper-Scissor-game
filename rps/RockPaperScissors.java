package rps;

/**
 * This class will initialize each round of the game, decide the result after 
 * each round and display the final result. 
 * @author Kartavya Goswami
 * @version 1.0
 * @since 1.8
 **/

public class RockPaperScissors extends Game {
	
	public RockPaperScissors(int rounds) {
		 super(rounds);
	}
	
	/**
	 * This method will initialize two player with type Human and Computer.
	 */
	public void initPlayers() {
		
		System.out.println("Enter your name : ");
		players[0] = new Human(in);
		players[1] = new Computer();		
	}
	
	/**
	 * This method will generate each round and ask the user
	 * id user wants to continue the game.
	 */
	public void play() {
		
		Round:	
		for (int j = 0; j < numRounds; j++) {
			System.out.println();
			for (int i = 0; i < players.length; i++) {
				if (!players[i].takeTurn()) {
					break Round;
				} 
			}
			evaluateRound();
			
			/**Implementation of the poor looser game**/
			if(j==(numRounds-1)) {
				System.out.print("Do you want to continue the game(Press Y for Yes and N for No)");
				//Scanner input = new Scanner(System.in);
				String answer = in.next();
				if(answer.equalsIgnoreCase("y")) {
					numRounds = numRounds+2;
				}
			}
			
		}
	}

	@Override
	/**
	 * This method will decide the result after each round.
	 */
	public void evaluateRound() {
		
		HandSign[] moves = new HandSign[] { players[0].getLastMove(), players[1].getLastMove() };
		int winner = HandSign.getWinner(moves);
		
		if(winner == -1) {
			System.out.println("It's a tie!");
			Player.tie();
	
		}
		else {
		
			System.out.println(moves[winner] + " beats " + moves[Math.abs(winner-1)] + "! " + players[winner].getName() + " wins!" );
			players[winner].win();
		}
		
	}
	
	/**
	 * This method will the final result of the game.
	 */
	public void displayResults() {
		/** The object of winner **/
		Player winner = null;
		System.out.println();
		for(int i=0;i<players.length;i++) {
			System.out.println(players[i].toString());
			
			if(players[i].getWins() > numRounds/2) {
				winner = players[i];				
			}
		}
		
		System.out.println("Ties :" + winner.getTies());
		
		if(winner == null) {
			System.out.println("It’s a tie game!");
		}
		else {
			System.out.println(winner.toString());
			System.out.println("The winner is " + winner.getName() + " !");
		}
		System.out.println("Thanks for playing Rock, Paper, Scissors. Bye!");
	}
	

	
	

}
