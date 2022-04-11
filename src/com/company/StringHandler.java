package com.company;

import static com.company.Calc.MAXLEN;
import static com.company.Calc.MINLEN;

public class StringHandler {

    private String firstString;
    private String secondString;
    private String thirdString;
    private int firstNumber;
    private int secondNumber;
    private boolean isRoman;

    public boolean isRoman() {
        return isRoman;
    }
    public void setIsRoman(boolean roman) {
        isRoman = roman;
    }
    public String getSecondString() {
        return secondString;
    }
    public int getFirstNumber() {
        return firstNumber;
    }
    public int getSecondNumber() {
        return secondNumber;
    }

    public void verify(String [] arStr) throws MathOperationException {

        if (!isCorrectLength(arStr)) throw new MathOperationException("Не является математической операцией");
        setStrings(arStr);
        if (!isMathOperation()) throw new MathOperationException("Не является математической операцией");
        if (NumberConversion.isArabicNumerals(firstString,thirdString)){
            setAnB();
            setIsRoman(false);
        } else if (NumberConversion.isRomanNumerals(firstString,thirdString)){
            firstNumber = NumberConversion.fromRomanToArabic(firstString);
            secondNumber = NumberConversion.fromRomanToArabic(thirdString);
            setIsRoman(true);
        } else {
            throw new MathOperationException("Не является математической операцией");
        }
    }

    private void setAnB() {
        this.firstNumber = Integer.parseInt(firstString);
        this.secondNumber = Integer.parseInt(thirdString);
    }
    private void setStrings(String [] arStr) {
        this.firstString = arStr[0];
        this.secondString = arStr[1];
        this.thirdString = arStr[2];
    }
    private boolean isMathOperation() {
        if(secondString.equals("+")
                ||secondString.equals("-")
                ||secondString.equals("*")
                ||secondString.equals("/")
        ) return true;
        return false;
    }
    private boolean isCorrectLength(String [] arStr) throws MathOperationException {
        if (arStr.length!=3) throw new MathOperationException("Не является математической операцией");
        if(
                (arStr[0].length()<=MAXLEN && arStr[0].length()>=MINLEN)
                ||
                (arStr[2].length()<=MAXLEN && arStr[2].length()>=MINLEN)
                ||
                        (arStr[1].length()==MINLEN)
        ) return true;
        return false;
    }


}
