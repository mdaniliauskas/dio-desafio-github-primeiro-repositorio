package br.com.dio;

/*
    Exercitando 3 - Recriar a aplicação para calcular a área dos 3 quadriláteros notáveis:
    quadrad, triângulo e trapézio, usando sobrecarga - mas dessa vez utilizando métodos que retornem valores.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício - área de quadriláteros notáveis: \n");
        System.out.println("A área do quadrado é " + Quadrilatero.area(4.5));
        System.out.println("A área do retangulo é " + Quadrilatero.area(2.1, 2.1));
        System.out.println("A área do trapézio é " + Quadrilatero.area(2, 1, 3));
    }
}