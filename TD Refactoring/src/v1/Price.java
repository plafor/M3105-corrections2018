package v1;

public abstract class Price {

	public abstract double getCharge(int nbDaysRented);

	public int getFrequentRenterPoints(int nbDaysRented) {
		return 1;
	}
}
