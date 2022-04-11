package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Calc calc = new Calc();
            calc.start();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
