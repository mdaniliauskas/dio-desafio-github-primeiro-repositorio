package br.com.dio;

public class Quadrilatero {

    // Área quadrado
    public static double area(double ladoQuadrado) {
        return ladoQuadrado * ladoQuadrado;
    }

    // Área retângulo
    public static double area(double base, double altura) {
        return base * altura;
    }

    // Área trapézio
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) /2) * altura;
    }
}
