
public class ConverterApp {
	public static void main(String [] args) {
		UnitConverter uc = new UnitConverter();
		ConverterUI converter1 = new ConverterUI(uc);
		converter1.run();
	}
}
