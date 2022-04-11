package com.company;

public class NumberConversion {

    public static int fromRomanToArabic (String str){
        for (RomanNumerals rn : RomanNumerals.values()
        ) {
            if (str.equals(rn.getCode())) {
                if(rn.ordinal()==0){
                    return rn.ordinal()+10;
                }else{
                    return rn.ordinal();
                }
            }
        }
        return -1;
    }
    public static RomanNumerals fromArabicToRoman (int a){
        for (RomanNumerals rn: RomanNumerals.values()
             ) {
            if (rn.ordinal()==a) return rn;
        }
        return RomanNumerals.TEN;
    }
    public static boolean isRomanNumerals(String str1, String str2){
        boolean a = false;
        boolean b = false;
        for (RomanNumerals rn:RomanNumerals.values()
        ) {
            if(a==false&&!str1.equals(rn.getCode())){
            }else{
                a=true;
            }
            if(b==false&&!str2.equals(rn.getCode())){
            }else{
                b=true;
            }
        }
        return (a&b);
    }
    public static boolean isArabicNumerals(String str1, String str2){
        try {
            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);
            if (a>0&&a<=10&&b>0&&b<=10){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }
}
enum RomanNumerals {
    TEN("X"), ONE("I"), TWO("II"), THREE("III"),FOUR("IV"),
    FIVE("V"),SIX("VI"),SEVEN("VII"),EIGHT("VIII"),NINE("IX");
    private String code;
    RomanNumerals(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}
