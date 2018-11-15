package v1;

public class TextStatement extends Statement {

	public String headerString(String name) {
		return "Rental Record for " + name + "\n";
	}

	public String eachRentalString(Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t" + aRental.getCharge() + "\n";
	}

	public String footerString(Customer aCustomer) {
		return "Amount owed is " + aCustomer.getTotalCharge() + "\n" + "You earned "
				+ aCustomer.getTotalFrequentRenterPoints() + " frequent renter points";
	}
}
