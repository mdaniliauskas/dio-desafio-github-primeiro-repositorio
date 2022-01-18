package br.com.dio;

/*  Exercicitando 3 — utilizar as variáveis e operações aritméticas aprendidas
e criar expressões em que as precedências influenciem os resultados
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstração de pré e pós-incremento: ");
        prePos();
        System.out.println();

        System.out.println("Demonstração de funcionamento de operações aritméticas básicas");
        arimetica();
        System.out.println();

        System.out.println("Demonstração de funcionamento de atribuições/operadores");
        atribuicao();
        System.out.println();

        System.out.println("Demonstração da alteração de resultado por conta da precedência");
        OrdemAlteraResultado();
        System.out.println();
    }

    private static void prePos() {
        // Demonstração de funcionamento de pré e pós-incremento;

        int i = 5;
        System.out.println("i = " + i);

        int i1 = i++;
        System.out.println("i++ = " + i);

        int i2 = ++i;
        System.out.println("++i = " + i + "\n");

        int j = 8;
        System.out.println("j = " + j);

        int j1 = --j;
        System.out.println("--j = " + j);

        int j2 = j--;
        System.out.println("j-- = " + j + "\n");
    }

    private static void arimetica() {
        // Demonstração de operações aritméticas simples

        int a = 10;
        int b = 20;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = b / a;
        int modulo = a % b;

        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");

        System.out.println("a + b = " + soma);
        System.out.println("a - b = " + subtracao);
        System.out.println("a * b = " + multiplicacao);
        System.out.println("b / a = " + divisao); // quando o b > a, o módulo é igual ao a
        System.out.println("a % b = " + modulo + "\n");
    }

    private static void atribuicao() {
        // Demonstração de atribuições/operadores

        double d = 100d;
        float f = 10.5f;
        long l = 1000000000000000000L;

        System.out.println("double i = " + d);
        System.out.println("float f = " + f);
        System.out.println("long l = " + l + "\n") ;

        d += f;
        System.out.println("i += f -> " + d);

        f -= d;
        System.out.println("f -= d -> " + f);

        f *= f;
        System.out.println("f *= f -> " + f);

        l /= 200000000000000000L;
        System.out.println("l /= 200000000000000000L -> " + l);

        l %= 2;
        System.out.println("l % 2 -> " + l + "\n");
    }

    private static void OrdemAlteraResultado() {
        // Demonstração da alteração de resultado por conta da precedência

        int i = 5;
        System.out.println("i = " + i);

        int j = 3;
        System.out.println("j = " + j + "\n");

        int a = i + j * i;
        System.out.println("i + j * i = " + a);

        int b = j + i * i;
        System.out.println("j + i * i = " + b + "\n");

        int c = j++ * i;
        System.out.println("j++ * i = " + c);
        System.out.println("j = " + j + "\n\n" +
                ""); // pós-incremento ocorrou após a multiplicação

        j = 3;
        int d = ++j * i;
        System.out.println("j = 3 novamente \n");
        System.out.println("++j * i = " + d);
        System.out.println("j = " + j + "\n"); // pré-incremento ocorrou antes a multiplicação
    }
}