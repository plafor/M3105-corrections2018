package dicegame;

public abstract class Dice {

	private int upperFaceValue;

	public abstract void roll();

	public int getUpperFaceValue() {
		return upperFaceValue;
	}

	public void setUpperFaceValue(int upperFaceValue) {
		this.upperFaceValue = upperFaceValue;
	}

	
	
}
