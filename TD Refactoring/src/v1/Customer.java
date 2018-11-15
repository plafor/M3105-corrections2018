package v1;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

/**
 * This class ...
 * @author plafor
 *
 */
public class Customer {

	/**
	 * the name of the customer
	 */
	private String name;
	/**
	 * rentals represent ...
	 */
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	/**
	 * add the rental argument in the rentals list
	 * @param aRental: the renatl to add
	 */
	public void addRental(Rental aRental) {
		rentals.add(aRental);
	}

	public String getName() {
		return name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement() {
		return new TextStatement().value(this);
	}

	public String htmlStatement() {
		return new TextHTMLStatement().value(this);
	}

	public double getTotalFrequentRenterPoints() {
		double result = 0;
		Iterator<Rental> theRentals = rentals.iterator();
		while (theRentals.hasNext()) {
			Rental each = theRentals.next();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		Iterator<Rental> theRentals = rentals.iterator();
		while (theRentals.hasNext()) {
			Rental each = theRentals.next();
			result += each.getCharge();
		}
		return result;
	}

}
