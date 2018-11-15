package v1;

public class TextHTMLStatement extends Statement {

	public String headerString(String name) {
		return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
	}

	public String eachRentalString(Rental aRental) {
		return aRental.getMovie().getTitle() + ": " + aRental.getCharge() + "<BR>\n";
	}

	public String footerString(Customer aCustomer) {
		return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n"
				+ "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
	}
}
