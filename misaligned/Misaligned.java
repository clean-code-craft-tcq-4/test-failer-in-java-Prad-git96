import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import misaligned.constants.MisaligedConstants;
import misaligned.references.ColorPrinterUtilityReferenceImpl;
import misaligned.utilities.ColorMapPrinterUtility;

public class Misaligned {

    public static void main(String[] args) { 
        int result = ColorMapPrinterUtility.getColorCodeCount();
        assert(result == 25);
        
        // Create a stream to hold the actual output
        ByteArrayOutputStream actualOutputStream = new ByteArrayOutputStream();
        PrintStream actualPrintStream = new PrintStream(actualOutputStream);
        
        // Create a stream to hold the expected output
        ByteArrayOutputStream expectedOutputStream = new ByteArrayOutputStream();
        PrintStream expectedPrintStream = new PrintStream(expectedOutputStream);

        PrintStream oldPrintStream  = System.out;
        System.setOut(actualPrintStream);
        ColorMapPrinterUtility.printColorMap();        
        
        System.out.flush();       
        System.setOut(expectedPrintStream);
        ColorPrinterUtilityReferenceImpl.printexpectedColorMap();
        
        System.out.flush();
        System.setOut(oldPrintStream);

        System.out.println("actual: \n" + actualOutputStream.toString());
        System.out.println("expected: \n" + expectedOutputStream.toString());
        
        assert(actualOutputStream.toString().equals(expectedOutputStream.toString()));       
        
        System.out.println("All is well!");
    }


}
