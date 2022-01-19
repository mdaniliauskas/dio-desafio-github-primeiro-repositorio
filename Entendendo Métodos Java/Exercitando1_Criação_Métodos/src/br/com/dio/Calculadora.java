package br.com.dio;

public class Calculadora {
    public static void somar(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        System.out.println(valor1 + " + " + valor2 + " = " + resultado);
    }

    public static void subtrair(double valor1, double valor2) {
        double resultado = valor1 - valor2;
        System.out.println(valor1 + " - " + valor2 + " = " + resultado);
    }

    public static void multiplicar(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        System.out.println(valor1 + " * " + valor2 + " = " + resultado);
    }

    public static void divir(double valor1, double valor2) {
        double resultado = valor1 / valor2;
        System.out.println(valor1 + " / " + valor2 + " = " + resultado);
    }
}
