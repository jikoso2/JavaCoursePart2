package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber (double a){
        this.firstNumber = a;
    }

    public void setSecondNumber (double a){
        this.secondNumber = a;
    }

    public double getAdditionResult (){
        return this.secondNumber + this.firstNumber;
    }

    public double getSubtractionResult (){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult (){
        return this.secondNumber * this.firstNumber;
    }

    public double getDivisionResult (){
        if (this.secondNumber != 0)
            return this.firstNumber / this.secondNumber;
        else
            return 0;
    }
}
