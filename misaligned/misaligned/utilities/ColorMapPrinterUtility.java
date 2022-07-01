package misaligned.utilities;

import misaligned.constants.MisaligedConstants;

public class ColorMapPrinterUtility {

	ColorMapPrinterUtility(){
		
	}
	
	public static void printColorMapByMajorMinorColorIndex(int majorColorIndex,int minorColorIndex) {
        System.out.printf("%5d | %8s | %5s\n", (majorColorIndex * 5 + minorColorIndex)+1, MisaligedConstants.MAJOR_COLORS[majorColorIndex], MisaligedConstants.MINOR_COLORS[minorColorIndex]);
	}
	
	public static void printColorMap() {
		for(int majorColorIndex = 0; majorColorIndex < MisaligedConstants.NO_OF_MAJOR_COLORS; majorColorIndex++) {
            for(int minorColorIndex = 0; minorColorIndex < MisaligedConstants.NO_OF_MINOR_COLORS; minorColorIndex++) {
            	printColorMapByMajorMinorColorIndex(majorColorIndex, minorColorIndex);
            }
        }
	}
	
	public static int getColorCodeCount() {
		return MisaligedConstants.NO_OF_MAJOR_COLORS*MisaligedConstants.NO_OF_MINOR_COLORS;
		
	}
}
