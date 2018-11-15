package v1;

public class Movie {

	private String title;
	private Price price;

	public Movie(String title, Price price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public double getCharge(int nbDaysRented) {
		return price.getCharge(nbDaysRented);
	}

	public int getFrequentRenterPoints(int nbDaysRented) {
		return price.getFrequentRenterPoints(nbDaysRented);
	}
}