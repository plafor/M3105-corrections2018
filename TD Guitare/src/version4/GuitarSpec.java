package version4;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	private Builder builder;
	private String model;
	private Type type;
	private int nbStrings;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, int nbStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.nbStrings = nbStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public boolean matches(GuitarSpec customerWish) {
		Builder builder = customerWish.getBuilder();
		if (builder != null && !builder.equals(getBuilder()))
			return false;
		
		String model = customerWish.getModel();
		if ((model != null) && (!model.equals(""))
				&& (!model.equalsIgnoreCase(getModel())))
			return false;
		
		Type type = customerWish.getType();
		if ((type != null) && (!type.equals(getType())))
			return false;
		
		Wood backWood = customerWish.getBackWood();
		if ((backWood != null) && (!backWood.equals(getBackWood())))
			return false;
		
		Wood topWood = customerWish.getTopWood();
		if ((topWood != null) && (!topWood.equals(getTopWood())))
			return false;
		
		int nbStrings = customerWish.getNbStrings();
		if ((nbStrings != NO_PREF_NUM_STRINGS) && (this.nbStrings != nbStrings))
			return false;
		return true;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNbStrings() {
		return nbStrings;
	}
	
	
}
