package br.com.dio;

/*
    Exercitando 3 - criar variáve e expressões para usar nas estruturas if e switch
                    Com if exiba o nome do mês de acordo com o número. Se for junho, dezembro e janeiro também exibir férias.
                    Com switch use String para a partir do dia da semana exibir seu número e ainda
                    Ainda com switch verificar se uma variável é inteira e for entre 1 e 3, exibir "Certo"
                    e se for 4 - "Errado", 5 - "Talvez". Para demais valores exibir indefinido.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercitando if, else e switch - controle de fluxo: \n");

        ifSemFlecha();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    /* Exemplo de if flecha - não fazer isso!
    private static void ifFlecha() {

        int mes = 20;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    */

    private static void ifSemFlecha() {

        int mes = 6;
        if (mes == 1) {
            System.out.println("Janeiro");
            System.out.println("Férias \n");
        } else if (mes == 2) {
            System.out.println("Fevereiro \n");
        } else if (mes == 3) {
            System.out.println("Março \n");
        } else if (mes == 4) {
            System.out.println("Abril \n");
        } else if (mes == 5) {
            System.out.println("Maio \n");
        } else if (mes == 6) {
            System.out.println("Junho");
            System.out.println("Férias \n");
        } else if (mes == 7) {
            System.out.println("Julho\n");
        } else if (mes == 8) {
            System.out.println("Agosto \n");
        } else if (mes == 9) {
            System.out.println("Setembro \n");
        } else if (mes == 10) {
            System.out.println("Outubro \n");
        } else if (mes == 11) {
            System.out.println("Novembro \n");
        } else if (mes == 12) {
            System.out.println("Dezembro");
            System.out.println("Férias \n");
        } else {
            System.out.println("Mês indefinido \n");
        }
    }

    /*
    Evitar esse tipo de caso, ao invés disso, utilizar switch

    private static void ifFerias() {

        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }
    */

    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        // Evitar comparações muito extensas, utilizar variáveis intermediárias para melhorar a leitura do código.
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio.\n");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio. \n");
        } else {
            System.out.println("Funcionário não deve receber auxílio. \n");
        }
    }

    private static void switchSemana() {
        String dia = "Quarta";
        switch (dia){
        case "Segunda":
            System.out.println(2);
            break;
        case "Terça":
            System.out.println(3);
            System.out.println();
            break;
        case "Quarta":
            System.out.println(4);
            System.out.println();
            break;
        case "Quinta":
            System.out.println(5);
            System.out.println();
            break;
        case "Sexta":
            System.out.println(6);
            System.out.println();
            break;
        case "Sábado":
            System.out.println(7);
            System.out.println();
            break;
        case "Domingo":
            System.out.println(1);
            System.out.println();
            break;
        default:
            System.out.println("Dia inválido");
            System.out.println();
            break;
        }
    }

    private static void switchNumero() {

        int numero = 4;
        switch (numero){
        case 1:
        case 2:
        case 3:
            System.out.println("Certo");
            System.out.println();
            break;
        case 4:
            System.out.println("Errado");
            System.out.println();
            break;
        case 5:
            System.out.println("Talvez");
            System.out.println();
            break;
        default:
            System.out.println("Valor Indefinido");
            System.out.println();
            break;
        }
    }

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
        case "dezembro":
        case "julho":
        case "janeiro":
            System.out.println("Férias");
            break;
        default:
            System.out.println("Mês Indefinido");
            break;
        }
    }
}
