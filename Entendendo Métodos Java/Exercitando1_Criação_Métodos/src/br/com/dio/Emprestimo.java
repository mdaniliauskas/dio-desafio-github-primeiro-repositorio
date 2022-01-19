package br.com.dio;

public class Emprestimo {
    public static void obterEmprestimo (int parcelas, double valor) {
        double totalEmprestimo;
        if (parcelas < 2 || parcelas > 10) {
            System.out.println("Número de parcelas inválidao! É permitido parcelas de 2 a um máximo de 10.");
        } else if (parcelas == 2) {
            totalEmprestimo = valor + (valor * 0.1);
            System.out.println("Valor do empréstimo: " + valor + ". Número de parcelas: " + parcelas + ". Valor total a ser pago: " + totalEmprestimo + ".");
        } else if (parcelas == 3) {
            totalEmprestimo = valor + (valor * 0.10);
            System.out.println("Valor do empréstimo: " + valor + ". Número de parcelas: " + parcelas + ". Valor total a ser pago: " + totalEmprestimo + ".");
        } else if (parcelas <= 5) {
            totalEmprestimo = valor + (valor * 0.15);
            System.out.println("Valor do empréstimo: " + valor + ". Número de parcelas: " + parcelas + ". Valor total a ser pago: " + totalEmprestimo + ".");
        } else {
            totalEmprestimo = valor + (valor * 0.30);
            System.out.println("Valor do empréstimo: " + valor + ". Número de parcelas: " + parcelas + ". Valor total a ser pago: " + totalEmprestimo + ".");
        }
    }
}

