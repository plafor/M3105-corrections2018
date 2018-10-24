package dicegame;

public class DiceWith6Faces extends Dice {

	@Override
	public void roll() {
		setUpperFaceValue(((int)(Math.random()*6)) + 1);
	}

}
