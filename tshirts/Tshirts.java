import tshirts.constants.ErrorMessageConstants;
import tshirts.utils.TshirtsUtilities;

public class Tshirts {
    

    public static void main(String[] args) { 

        assert(TshirtsUtilities.getSize(-37) == ErrorMessageConstants.T_INVALID_INPUT);
        assert(TshirtsUtilities.getSize(30) == ErrorMessageConstants.T_SIZE_UNAVAILABLE);
    	assert(TshirtsUtilities.getSize(31) == "XS");
        assert(TshirtsUtilities.getSize(34) == "XS");
        assert(TshirtsUtilities.getSize(37) == "S");
        assert(TshirtsUtilities.getSize(38) == "M");
        assert(TshirtsUtilities.getSize(40) == "M");
        assert(TshirtsUtilities.getSize(43) == "L");
        assert(TshirtsUtilities.getSize(46) == "XL");
        assert(TshirtsUtilities.getSize(50) == "2XL");
        assert(TshirtsUtilities.getSize(54) == "3XL");
        assert(TshirtsUtilities.getSize(58) == ErrorMessageConstants.T_SIZE_UNAVAILABLE);
        
        System.out.println("All is well!");
    }
}
