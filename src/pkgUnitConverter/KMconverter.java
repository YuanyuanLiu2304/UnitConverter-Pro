package pkgUnitConverter;

/**
 * Concrete class to convert kilobytes to megabytes
 * @author yuanyuanliu
 */
public class KMconverter implements UnitConverterBehaviour{
    
         /**
          * the conversion factor used for unit conversions
          */
         private final int convFactor=1024;
	 
	
	/**
         * Converts kilobytes to megabytes
	 * @param kilobytes values in kilobytes to be converted
	 * @return equivalent values in megabytes
	 */
         @Override
	public double convert(double kilobytes) {
		return kilobytes / convFactor;
	}
    
}
