import java.util.Scanner;

public class QuitGame {
	public static void main(String[] args) {
		for (int round = 1; round <= 30; round++) { //Loops for 30 rounds
			System.out.println("Round " + round);

			//Checking if it's the 5th round
			if (round % 5 == 0) {
				System.out.println("Quit Game? Yes/No");

				//Scanning for Yes/No answer to Quit Game?
				Scanner YesNo = new Scanner (System.in);
				String yesno = YesNo.next();
				
				//Making input Yes/No case-insensitive
                yesno = yesno.substring(0, 1).toUpperCase() + yesno.substring(1).toLowerCase();
				
                if(yesno.equals("Yes")) {
					System.out.println("See you again Champ!");
					System.out.println("Game over!");
					break;// Exit the loop and ends the game
				}
				else if (yesno.equals("No")) {
					System.out.println("Continue to next the round");


				}
			}
		}
	}
}


