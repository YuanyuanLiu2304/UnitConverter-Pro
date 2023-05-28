
package pkgUnitConverter;
/**
 * Concrete class to convert Fahrenheit to Celsius
 * @author yuanyuanliu
 */
public class FCconverter implements UnitConverterBehaviour {
        
        /**
         * the conversion factor used for unit conversions
         */
	private final double convFactor=1.8;
        
        /**
         * the origin value used in the Fahrenheit to Celsius conversion
         */
	private final double convOrigin=32.0;
	
	/**
         * Converts temperature Fahrenheit to Celsius
	 * @param fahrenheit values in Fahrenheit to be converted
	 * @return equivalent values in Celsius
	 */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}
}
