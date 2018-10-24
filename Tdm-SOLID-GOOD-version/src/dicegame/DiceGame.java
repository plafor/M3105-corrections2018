package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private Input input;
	private Display display;
	
	public DiceGame(Input input, Display display) {
		super();
		this.input = input; 
		this.display = display;
		dice = new DiceWith6Faces();
		
		// change next line depending on the dice
		// dice = new  DiceWith8Faces();
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	public void playOneRound() {
		display.displayEntryText();
		int userChoice =input.readInt();
		int diceRollValue = getRandomDiceValue();
		display.displayDiceValue(diceRollValue);
		if (userChoice == diceRollValue)
			display.displaySuccessText();
		display.displayPlayAgainText();
	}

	public int getRandomDiceValue() {
		dice.roll();
		return dice.getUpperFaceValue();
	}
}
