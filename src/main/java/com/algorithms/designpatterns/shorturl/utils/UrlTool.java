package com.algorithms.designpatterns.shorturl.utils;

public class UrlTool {
    public static char[] shorturl;


    public static String getShortUrl(Long urlId){
        return generateUrl(urlId);
    }

    public static String generateUrl(Long id){
        return addHexaDecimals(UrlConstants.BASE_URL, getHexaDecimal(id));
    }

    public static String addHexaDecimals(String base, String value){
        StringBuilder result = new StringBuilder();
        Long carry = 0L;
        int bLength = base.length();
        int vLength = value.length();

        for(int i = 0; i < bLength; i++){
            long sum = getDecimal(base.charAt(bLength-i-1)) + (i<vLength ? getDecimal(value.charAt(vLength-i-1)) : 0) + carry;
            carry = sum/16;
            result.append(getHexaDecimal(sum % 16));
        }
        if(carry!=0) result.append(getHexaDecimal(carry % 16));
        return result.reverse().toString();
    }

    public static String getHexaDecimal(Long id){
        if (id == 0){
            return "";
        }
        String hexValue = "" +"0123456789abcdef".charAt((int)(id%16));
        return getHexaDecimal(id/16) + hexValue;
    }

    public static Long getDecimal(Character c){
        return (long) Character.digit(c, 16);
    }
}
