package v1;

public class ChildrenPrice extends Price {

	@Override
	public double getCharge(int nbDaysRented) {
		double result = 1.5;
		if (nbDaysRented > 3)
			result += (nbDaysRented - 3) * 1.5;
		return result;
	}
	
	

}
