package dicegame;

public class DiceWith8Faces extends Dice {

	@Override
	public void roll() {
		setUpperFaceValue(((int)(Math.random()*8)) + 1);
	}

}
