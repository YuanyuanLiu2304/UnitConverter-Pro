
package pkgUnitConverter;

/**
 * Interface for the conversion strategy
 * @author yuanyuanliu
 */
public interface UnitConverterBehaviour {
    
    /**
         * Converts the given value using the conversion strategy.
	 * @param value the value to be converted
	 * @return the converted value
	 */
	public double convert(double value);
    
    
}
