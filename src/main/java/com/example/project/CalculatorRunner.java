package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc = new Calculator("TI-84");
        //2. call any methods of that class to test
        System.out.println(calc.average(3, 10));
        System.out.println(calc.absoluteValue(5, 23));
        System.out.println(calc.coordinatePair(5, 23));
        System.out.println(calc.divisibleBy(4, 3));
        System.out.println(calc.divisibleBy(4, 2));
        System.out.println(calc.info());
    }
}
