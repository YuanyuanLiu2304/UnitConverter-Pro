
package pkgUnitConverter;
/**
 * Concrete class to convert Celsius to Fahrenheit
 * @author yuanyuanliu
 */
public class CFconverter implements UnitConverterBehaviour{
    
    
        /**
         * the conversion factor used for unit conversions
         */
	private final double convFactor=1.8;
        
        /**
         * the origin value used in the Celsius to Fahrenheit conversion
         */
	private final double convOrigin=32.0;
        
        
	/**
         * Converts temperature Celsius to Fahrenheit
	 * @param celsius values in Celsius to be converted
	 * @return equivalent values in Fahrenheit
	 */
        @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}
}
