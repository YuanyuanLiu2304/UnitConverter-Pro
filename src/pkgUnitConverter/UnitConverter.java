
package pkgUnitConverter;

/**
 * The UnitConverter class is responsible for managing the conversion of values using different conversion behaviors,
 * it provides methods to set the type of conversion behavior and convert a given value using the selected type of conversion behavior.
 * @author yuanyuanliu
 */
public class UnitConverter {
    
           /**
            * an instance of the UnitConverterBehaviour interface
            */
	   private UnitConverterBehaviour unitConverter;
           
           
    /**
     * Sets the type of conversion behavior
     * @param unitConverter the type of conversion behavior
     */
    public void setUnitConverter(UnitConverterBehaviour unitConverter) {
        this.unitConverter = unitConverter;
    }

    /**
     * Converts the given value using the selected conversion behavior
     * @param value the value to be converted
     * @return the converted value
     */
    public double convert(double value) {
        return unitConverter.convert(value);
    }
}
