package br.com.dio;

/*
    Exercitando 1 - criar aplicações para as seguintes situações
    - Fazer uma calculadora para as 4 operações básicas (passar 2 valores)
    - A partir da hora do dia fornecida, informar mensagem adequada de saudação: bom dia, boa tarde, boa noite.
    - Realizar o cálculo de um empréstico a partir do valor solicitado. As taxas e parcelas influenciam os valores,
      criar livremente faixas que influenciam nos valores
 */

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício - Calculadora");
        Calculadora.somar(24.5, 74.5);
        Calculadora.subtrair(28.6, 13);
        Calculadora.multiplicar(111, 5);
        Calculadora.divir(999.99, 2);
        System.out.println();

        // Mensagem de saudação
        System.out.println("Exercício - Saudação de acordo com a hora");
        MensagemSaudacao.obterHora(0);
        MensagemSaudacao.obterHora(7);
        MensagemSaudacao.obterHora(15);
        MensagemSaudacao.obterHora(20);
        MensagemSaudacao.obterHora(24);
        System.out.println();

        // Mensagem de Saudação - Segunda forma
        System.out.println("Exercício - Empréstimo");
        Emprestimo.obterEmprestimo(1, 100);
        Emprestimo.obterEmprestimo(2, 100);
        Emprestimo.obterEmprestimo(3, 100);
        Emprestimo.obterEmprestimo(4, 100);
        Emprestimo.obterEmprestimo(5, 100);
        Emprestimo.obterEmprestimo(6, 100);
        Emprestimo.obterEmprestimo(7, 100);
        Emprestimo.obterEmprestimo(10, 100);
        Emprestimo.obterEmprestimo(11, 100);
    }
}
