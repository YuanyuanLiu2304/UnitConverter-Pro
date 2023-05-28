
package pkgUnitConverterTest;

import pkgUnitConverter.*;

/**
 * This is a test class to test classes for converting Fahrenheit to Celsius, kilobytes to megabytes, and their reverse.
 * @author yuanyuanliu
 */
public class UnitConverterTest {

    /**
     * Creates an instance of the UnitConverter class and performs various conversion tests.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create a new instance of the UnitConverter class
        UnitConverter uc = new UnitConverter();
        
        // Test temperature conversion from Fahrenheit to Celsius
        uc.setUnitConverter(new FCconverter());
        System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0,uc.convert(70.0));
        
        // Test temperature conversion from Celsius to Fahrenheit
        uc.setUnitConverter(new CFconverter());
        System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, uc.convert(20.0));
        
        // Test file size conversion from kilobytes to megabytes
        uc.setUnitConverter(new KMconverter());
        System.out.printf("%.2f kilobytes is %.2f megabyte(s)\n", 1024.0, uc.convert(1024.0));
        
        // Test file size conversion from megabytes to kilobytes
        uc.setUnitConverter(new MKconverter());
        System.out.printf("%.2f megabyte is %.2f kilobytes(s)\n", 1.0, uc.convert(1.0));

    }

}
