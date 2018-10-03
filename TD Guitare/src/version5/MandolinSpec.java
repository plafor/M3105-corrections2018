package version5;

public class MandolinSpec extends InstrumentSpec {

	private Style style;

	public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);	
		this.style = style;
	}
	
	@Override
	public boolean matches(InstrumentSpec customerWish) {
		if (!(customerWish instanceof MandolinSpec))
			return false;
		
		if (!super.matches(customerWish))
			return false;
		
		Style style = ((MandolinSpec)customerWish).getStyle();
		if ((style != null) && (this.style != style))
			return false;
		return true;
	}
	
	public Style getStyle() {
		return style;
	}
	
	@Override
	public String toString() {
		return "Caracteristiques de la mandoline : " 
				+ super.toString() 
				+ "\n\t * style = " + style;
	}
}
