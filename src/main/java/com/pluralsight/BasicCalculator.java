package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        float firstNumber = calculator.nextFloat();
        System.out.print("Enter the second number: ");
        float secondNumber = calculator.nextFloat();
        System.out.print("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide");
        //System.out.printf(5 * 12 =%f);

    }
}
