package v1;

import java.util.Iterator;

public abstract class Statement {
	
	// methode socle
	public final String value(Customer aCustomer) {
		Iterator<Rental> theRentals = aCustomer.getRentals().iterator();
		// variation 1
		String result = headerString(aCustomer.getName());
		
		while (theRentals.hasNext()) {
			Rental each = theRentals.next();
			// variation 2
			result += eachRentalString(each);
		}
		// variation 3
		result += footerString(aCustomer);
		
		return result;
	}

	public abstract String headerString(String aCustomerName);
	public abstract String eachRentalString(Rental aRental);
	public abstract String footerString(Customer aCustomer);
}
