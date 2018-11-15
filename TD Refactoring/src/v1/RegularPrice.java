package v1;

public class RegularPrice extends Price {

	@Override
	public double getCharge(int nbDaysRented) {
		double result = 2;
		if (nbDaysRented > 2)
			result += (nbDaysRented - 2) * 1.5;
		return result;
	}
}
