package v1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

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
