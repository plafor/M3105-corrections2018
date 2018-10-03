package version5;

public class GuitarSpec extends InstrumentSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	private int nbStrings;

	public GuitarSpec(Builder builder, String model, int nbStrings, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);	
		this.nbStrings = nbStrings;
	}
	
	@Override
	public boolean matches(InstrumentSpec customerWish) {
		if (!(customerWish instanceof GuitarSpec))
			return false;
		
		if (!super.matches(customerWish))
			return false;
		
		int nbStrings = ((GuitarSpec)customerWish).getNbStrings();
		if ((nbStrings != NO_PREF_NUM_STRINGS) && (this.nbStrings != nbStrings))
			return false;
		return true;
	}
	
	public int getNbStrings() {
		return nbStrings;
	}

	@Override
	public String toString() {
		return "Caracteristiques de la guitare : " 
				+ super.toString() 
				+ "\n\t * nbStrings= " + nbStrings;
	}
	
	
}
