package br.com.dio;

public class Quadrilatero {

    // Área quadrado
    public static void area(double ladoQuadrado) {
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado de lados " + ladoQuadrado + " é " + areaQuadrado);
    }

    // Área retângulo
    public static void area(double base, double altura) {
        double areaRetangulo = base * altura;
        System.out.println("A área do retângulo de base " + base + " e de altura " + altura + " é " + areaRetangulo);
    }

    // Área trapézio
    public static void area(double baseMaior, double baseMenor, double altura) {
        double areaTrapezio = ((baseMaior + baseMenor) /2) * altura;
        System.out.println("A área do trapézio de base maior: " + baseMaior + ", base menor: " + baseMenor + " e " + "altura: " + altura + " é " + areaTrapezio);
    }
}
