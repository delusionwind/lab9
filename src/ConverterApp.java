
/**
 * the application of distance converter
 * @author Napon Kittisiriprasert
 */
public class ConverterApp {
	/**
	 * create the UI and run the distance converter
	 * @param args
	 */
	public static void main(String [] args) {
		UnitConverter uc = new UnitConverter();
		ConverterUI converter1 = new ConverterUI(uc);
		converter1.run();
	}
}
