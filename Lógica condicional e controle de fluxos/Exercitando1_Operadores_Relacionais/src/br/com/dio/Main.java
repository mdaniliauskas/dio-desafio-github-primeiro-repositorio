package br.com.dio;

/*
    Exercitando 1 - operadores relacionais
    Criar um simples projeto no Intellij para realizar comparações
 */

public class Main {
    public static void main(String[] args) {
        int i1 = 50;
        int i2 = 128;

        float f1 = -20.4f;
        float f2 = 3.14f;

        double d1 = 256d;
        double d2 = 3.14d;

        long l1 = 128L;
        long l2 = 256L;

        String s1 = "Bootcamp";
        String s2 = "Cognizant";

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("Comparações com operádores lógicos e diferentes tipos de dados: ");
        System.out.println("i1 > i2 : " + (i1 > i2));
        System.out.println("i2 < i2 : " + (i2 < i1) + "\n");

        System.out.println("f1 == f2 : " + (f1 == f2));
        System.out.println("f1 != i2 : " + (f1 != f2) + "\n");

        System.out.println("s1 != s2 : " + (s1 != s2) + "\n");

        System.out.println("b1 != b2 : " + (b1 != b2) + "\n");

        System.out.println("f1 == d2 :" + (f1 == d2));
        System.out.println("i1 >= d1 :" + (i1 >= d1));
        System.out.println("i2 <= l2 :" + (i2 <= l2));
        System.out.println("d1 == l2 :" + (d1 == l2) + "\n");
    }
}
