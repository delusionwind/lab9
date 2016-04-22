
/**
 * sets of Length and its unit
 * @author Napon Kittisiriprasert
 */
public enum Length implements Unit{
	METER( "Meter", 1.0 ),
	FOOT( "Foot", 0.3048 ),
	INCH( "Inch", 0.0254 ),
	MILE( "Mile", 1609.344 ),
	YARD( "Yard", 3*FOOT.getValue() ),
	MICRON( "Micron", 1.0E-6 ),
	CENTIMETER( "Centimeter", 0.01 ),
	KILOMETER( "Kilometer", 1000 ),
	WA( "Wa", 2 );
	
	
	public final String name;
	
	public final double value;
	
	/**
	 * constructor
	 * @param n the name
	 * @param v the value
	 */
	private Length(String n, double v) {
		name = n;
		value = v;
	}
	
	public double getValue() { return value; }
	public String toString() { return name; }
}
