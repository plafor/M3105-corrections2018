package v1;

public class NewReleasePrice extends Price {

	@Override
	public double getCharge(int nbDaysRented) {
		return nbDaysRented * 3.;
	}

	public int getFrequentRenterPoints(int nbDaysRented) {
		if (nbDaysRented > 1)
			return 2;
		return 1;
	}
}
