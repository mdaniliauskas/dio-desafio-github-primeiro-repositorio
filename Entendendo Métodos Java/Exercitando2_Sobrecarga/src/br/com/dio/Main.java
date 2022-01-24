package br.com.dio;

/*
    Exercitando 2 - Criar uma aplicação para calcular a área dos 3 quadriláteros notáveis:
    quadrad, triângulo e trapézio, usando sobrecarga.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício - área de quadriláteros notáveis: \n");
        Quadrilatero.area(4.5);
        Quadrilatero.area(2.1, 2.1);
        Quadrilatero.area(2, 1, 3);
    }
}
