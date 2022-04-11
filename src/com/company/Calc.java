package com.company;


public class Calc {

    public static final int MAXLEN = 4;
    public static final int MINLEN = 1;
    private int result;

    public void start() throws Exception{
        String [] data = IO.readData();
        StringHandler sh = new StringHandler();
        sh.verify(data);
        calculate(sh.getFirstNumber(),sh.getSecondString(),sh.getSecondNumber());
        if(sh.isRoman()){
            if (result<1) throw new MathOperationException("В римской системе счисления нет отрицательных чисел.");
            IO.printResult(getResultInRoman());
        }else {
            IO.printResult(getResult());
        }
    }

    private String getResultInRoman() {
        return NumberConversion.fromArabicToRoman(result).getCode();
    }
    private void setResult(int result) {
        this.result = result;
    }
    private String getResult() {
        return Integer.toString(result);
    }
    private void calculate(int a, String operation, int b)  {
        switch (operation){
            case "+":
                setResult(a + b);
                break;
            case "-":
                setResult(a - b);
                break;
            case "*":
                setResult(a * b);
                break;
            case "/":
                setResult(a / b);
                break;
        }
    }

}

