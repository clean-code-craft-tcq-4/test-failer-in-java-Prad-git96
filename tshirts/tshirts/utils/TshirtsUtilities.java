package tshirts.utils;

import tshirts.constants.ErrorMessageConstants;

public class TshirtsUtilities {
	private TshirtsUtilities() {}
	
    public static String getSize(int cms) {
    	if(cms<=0) {
    		return ErrorMessageConstants.T_INVALID_INPUT;
    	}else if (cms<=30) {
    		return ErrorMessageConstants.T_SIZE_UNAVAILABLE;
    	}else if (cms<=34) {
    		return "XS";
    	}else if(cms < 38) {
            return "S";
        } else if(cms >= 38 && cms < 42) {
            return "M";
        } else if(cms >=42 && cms<46) {
            return "L";
        }else if(cms>=46 && cms<50) {
        	return "XL";
        }else if(cms>=50 && cms<54) {
        	return "2XL";
        }else if(cms>=54 && cms<58) {
        	return "3XL";
        }else {
        	return ErrorMessageConstants.T_SIZE_UNAVAILABLE;
        }
    }
}
