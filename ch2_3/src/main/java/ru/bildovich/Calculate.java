package ru.bildovich;

public class Calculate{

    private double result;

    public void add(double first, double second){
        this.result = first + second;
    }

    public void substruct(double first, double second){
        this.result = first-second;
    }

    public void div(double first, double second){
        this.result = first/second;
    }

    public void multiple(double first, double second){
        this.result = first * second;
    }

    public double getResult(){return this.result;}

    public static void main(String[] args) {
        Calculate calc = new Calculate();
    }
}