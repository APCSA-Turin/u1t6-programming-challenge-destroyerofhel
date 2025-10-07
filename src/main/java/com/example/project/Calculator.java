package com.example.project;
public class Calculator{
    public String calcModel;
    
    //constructor that creates an instance of the calculator class
    //the calculator class has one attirbute -> a string that holds the model name of the calculator 
    public Calculator(String x) {
        //implement code here
        calcModel = x;
    }
    
    // method that performs the operation designated by operand (which
    // could be +, -, *, or /) and returns the result of that operation
    // performed between num1 and num2
    // NOTE: if operand is some String other than "+", "-", "*", or "/" then
    // this method should return 0
    // REMINDER: use .equals to test if one string is equal to another (not ==)
    public double performOperation(String operand, int num1, int num2) {
        //implement code here
        double result = 0;
        if(operand.equals("+")) {result = num1 + num2;}
        else if(operand.equals("-")) {result = num1 - num2;}
        else if(operand.equals("*")) {result = num1 * num2;}
        else {result = num1 / num2;}
        return result;
    }

    // method that checks if num1 is evenly divisible by num2, and if so,
    // returns true, and if not, returns false
    public boolean divisibleBy(int num1, int num2) {
        //implement code here
        return (double)num1/num2 % 1 == 0;
    }

    // method that constructs and returns a string representing a coordinate
    // pair in the format: "(x, y)"
    public String coordinatePair(int x, int y) {
        //implement code here
        return "("+x+","+y+")";
    }
    // method that determines and returns the result of |num1 - num2|
    public int absoluteValue(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    //method that returns the average of two numbers. 
    //the number returned should be rounded to the nearest tenth
    public double average(int num1, int num2){
        double avg = (num1 + num2)/2f;
        return Math.round(avg*100)/100f;
    }
    
    // method that constructs and returns a String in the format:
    // "This calculator is a model "+____+" where "+____+" should be filled in
    // with the value stored in the calcModel instance variable."
    public String info() {
        //implement code here
        return "This calculator is a model " + calcModel;
    }
}