package br.com.dio;

/*  Exercitando 1 — boas práticas na nomeação de variáveis
    Foi solicitado fazer essas declarações no método main
    Contêm erros para fins do exercício (esses foram comentados)
*/

public class Main {
    public static void main(String[] args) {
        // Declarando
        int i;
        // int i; não pode declarar duas vezes
        int I;
        //int 1a; não pode começar com número
        int _1a; // não acusa erro de compilação, mas não é uma boa prática
        int $aq; // não acusa erro de compilação, mas não é uma boa prática

        // Inicializando
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;


        final int j = 10; // final = constante = imutável
        // j = 15; demonstração que acusa erro de compilação ao tentar mudar o valor
        int asrn24678md;
        // int asrn246 78md; não pode ter espaço no nome da variável
        int asrn2$4678_md = 10; // não é uma boa prática ($)
        // int asrn2$46%78_md = 10; não compila pelo (%) - caracter especial

        asrn24678md = 100;
        // asrn2$4678_md = 10; redundância na declaração

        int quantidadeProduto = 50;
        int QuantidadeProduto; // não dá erro de compilação, mas não segue boa prática de camal case
        final int NUMERO_TENTATIVAS = 5; // segue a boa prática de constante (final) -> tudo maiúscual e e separação com (_)
        final int numeroTentativas = 5; // não dá erro de compilação, mas não segue a boa prática
        int QUANTITADE_OPCOES = 25; // não dá erro de compilação, mas como não é final, não deveria estar em maiúsculo
        int qtdProd; // não dá erro de compilação, mas preferir nomes mais expressivos. Ex.: Prod pode ser abreviação de muitas coisas

        // Fazendo a impressão dos valores e testando se ocorre a compilação

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTITADE_OPCOES);
    }
}
