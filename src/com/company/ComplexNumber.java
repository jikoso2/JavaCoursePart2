package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (ComplexNumber nmbr){
        this.real += nmbr.real;
        this.imaginary += nmbr.imaginary;
    }

    public void add (double a, double b){
        ComplexNumber nmbr = new ComplexNumber(a,b);
        add(nmbr);
    }
    public void subtract (ComplexNumber nmbr){
        this.real -= nmbr.real;
        this.imaginary -= nmbr.imaginary;
    }

    public void subtract (double a, double b){
        ComplexNumber nmbr = new ComplexNumber(a,b);
        subtract(nmbr);
    }
}
