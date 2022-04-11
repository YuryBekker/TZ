package com.company;

import java.util.Scanner;

public class IO {
    public static String [] readData (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an expression:");
        String str = in.nextLine();
        String [] arr = str.split(" ",3);
        in.close();
        return arr;
    }
    public static void printResult (String result){
        System.out.println(result);
    }
}
