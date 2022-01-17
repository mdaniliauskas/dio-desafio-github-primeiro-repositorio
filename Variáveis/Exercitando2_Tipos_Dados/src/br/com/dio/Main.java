package br.com.dio;

/*  Exercitando 2 — Tipos de dados
    Criar duas variáveis para cada tipo de dado apresentado
    Solicitado fazer o exercício dentro do método main
 */

public class Main {
    public static void main(String[] args) {
        byte b1 = 0;
        byte b2 = 1;

        short s1 = -30000;
        short s2 = 32767;

        int i1 = 12100;
        int i2 = -2000;

        long l1 = -100000000L; // Colocar o L no final para indicar Long
        long l2 = 2000000000L; // Colocar o L no final para indicar Long

        float f1 = 8.9F; // Colocar o F no final, senão entenderá como double
        float f2 = -50.5F; // Colocar o F no final, senão entenderá como double

        double d1 = -150.99D; // Colocar o D no double é opcional
        double d2 = 999.99D; // Colocar o D no double é opcional

        char c1 = 'M';
        char c2 = 'D';

        String strng1 = "Ate";
        String strng2 = "mais";

        boolean bool1 = false;
        boolean bool2 = true;

        // Realizando o teste de compilação e exibição
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(strng1);
        System.out.println(strng2);
        System.out.println(bool1);
        System.out.println(bool2);
    }
}
