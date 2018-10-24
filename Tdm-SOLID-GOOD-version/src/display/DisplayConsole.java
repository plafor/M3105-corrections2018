package display;

import dicegame.Display;

public class DisplayConsole implements Display {

	/* (non-Javadoc)
	 * @see display.Display#displayDiceValue(int)
	 */
	@Override
	public void displayDiceValue(int diceRollValue) {
		System.out.println("Dice roll..");
		System.out.println("The value is " + diceRollValue);
	}
	
	/* (non-Javadoc)
	 * @see display.Display#displayEntryText()
	 */
	@Override
	public void displayEntryText() {
		System.out.println("Guess the dice value on next roll : ");
	}

	/* (non-Javadoc)
	 * @see display.Display#displayPlayAgainText()
	 */
	@Override
	public void displayPlayAgainText() {
		System.out.println("play again ?");
	}

	/* (non-Javadoc)
	 * @see display.Display#displaySuccessText()
	 */
	@Override
	public void displaySuccessText() {
		System.out.println("Well done!");
	}
}
