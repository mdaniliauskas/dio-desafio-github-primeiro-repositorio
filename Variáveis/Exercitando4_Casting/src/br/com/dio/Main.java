package br.com.dio;

public class Main {
    public static void main(String[] args) {
        /*  Exercitando 4 - Realizar exemplos de casting
            Solicitado realizar o exercício dentro do método main
         */

        System.out.println("Casting implícito");

        int i = 5;
        byte b = 2;
        int a = i + b;

        System.out.println("int i = " + i);
        System.out.println("byte = " + 2);
        System.out.println("int a = i + b = " + a + "\n"); // int acomoda o byte

        float f = 10.5f;
        float e = f * i;
        System.out.println("int i = " + i);
        System.out.println("float f = " + f);
        System.out.println("float e = f * i = " + e + "\n\n"); // float acomoda int


        System.out.println("Casting explícito");

        byte c = (byte) (i + b);
        System.out.println("int i = " + i);
        System.out.println("byte = " + 2);
        System.out.println("byte c = (byte) (i + b) = " + c + "\n"); // byte não acomoda o int, downcast do int

        int g = (int) (f * i);
        System.out.println("int i = " + i);
        System.out.println("float f = " + f);
        System.out.println("int g = (int) (f * i) = " + g + "\n"); // int não acomoda o float, downcast do float, perda de dados (casa decimal).
    }
}
