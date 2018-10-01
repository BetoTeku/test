package com.company;

public class Calculadora {

    public static void main(String[] args) {

	    Calculadora calc = new Calculadora();

	    System.out.println(calc.resta(2, 3));
        System.out.println(calc.suma(2, 3));
        System.out.println(calc.suma(180, 20));
        System.out.println(calc.resta(30, 50));

    }

    public int resta(int a, int b){
        return a - b;
    }
    public int suma(int a, int b){
        return a + b;
    }

}
