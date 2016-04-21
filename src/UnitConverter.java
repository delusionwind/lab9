
public class UnitConverter {
	public double convert(double amount, Unit fromUnit, Unit toUnit ) {
		double x = amount*fromUnit.getValue();
		return x/toUnit.getValue();
	}
	
	public Unit[] getUnits() {
		return Length.values();
	}
}
