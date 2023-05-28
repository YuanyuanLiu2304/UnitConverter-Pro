
package pkgUnitConverter;

/**
 * Concrete class to convert megabytes to kilobytes
 * @author yuanyuanliu
 */
public class MKconverter implements UnitConverterBehaviour{
    
         /**
          * the conversion factor used for unit conversions
          */
         private final int convFactor=1024;
	 
	
	/**
         * Converts megabytes to kilobytes
	 * @param megabytes values in megabytes to be converted
	 * @return equivalent values in kilobytes
	 */
         @Override
	public double convert(double megabytes) {
		return megabytes * convFactor;
	}
    
}
