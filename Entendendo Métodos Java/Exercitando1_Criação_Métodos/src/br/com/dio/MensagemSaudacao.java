package br.com.dio;

public class MensagemSaudacao {
    public static void obterHora(int hora) {
        // Código usando switch case por orientação do professor. Poderia usar um if else com as faixas de hora (seria mais prático)
        switch (hora) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                exibirMensagem("Boa madrugada!");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                exibirMensagem("Bom dia!");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                exibirMensagem("Boa tarde!");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                exibirMensagem("Boa noite!");
                break;
            default:
            exibirMensagem("Por favor, digite um horário válido - formato 24h e sem os minutos");
            break;

        /* Observação - novo Switch case Java 17
            switch (hora) {
            case 0, 1, 2, 3, 4 -> exibirMensagem("Boa madrugada!");
            case 5, 6, 7, 8, 9, 10, 11, 12 -> exibirMensagem("Bom dia!");
            case 13, 14, 15, 16, 17 -> exibirMensagem("Boa tarde!");
            case 18, 19, 20, 21, 22, 23 -> exibirMensagem("Boa noite!");
            default -> exibirMensagem("Por favor, digite um horário válido - formato 24h e sem os minutos");
         */
        }
    }

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem + "\n");
    }
}
