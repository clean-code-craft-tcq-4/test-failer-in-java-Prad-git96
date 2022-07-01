package misaligned.references;

import misaligned.constants.MisaligedConstants;

public class ColorPrinterUtilityReferenceImpl {
	ColorPrinterUtilityReferenceImpl(){}
	
    public static void printexpectedColorMap() {
        
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.printf("%5d | %8s | %5s\n", (i * 5 + j)+1,MisaligedConstants.MAJOR_COLORS[i], MisaligedConstants.MINOR_COLORS[j]);
            }
        }
    }
}
