package tshirts.utils;
public class TshirtsUtilities {
	private TshirtsUtilities() {}
	
    public static String getSize(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms > 38 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }
}
