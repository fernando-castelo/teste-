import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;
        int numQuestoes = 0;
        String escolha = "SIM";
        while (escolha.equals("SIM")) {
            System.out.println("Insira um nível de dificuldade(1 ou 2): ");
            String dificuldade = input.next();
                      if (dificuldade.equals("1")) {
                        while (numQuestoes < 10) {
                            numQuestoes++;
                            int numero1 = Dificuldade.nivel1();
                            int numero2 = Dificuldade.nivel1();
                            System.out.println(gerarPergunta(numero1, numero2));
                            int resposta = input.nextInt();
                            if (resposta != gerarResposta(numero1, numero2)) {
                                System.out.println(FeedBack.feedNegativo());
                            }
                            if (resposta == gerarResposta(numero1, numero2)) {
                                System.out.println(FeedBack.feedPositivo());
                                acertos++;
                            }
                        }
                            if (numQuestoes == 10) {
                                int porcentagem = (100 * acertos) / numQuestoes;
                                System.out.println("Sua porcentagem de acertos: " + porcentagem + " %");
                                if (porcentagem >= 75) {
                                    System.out.println("Parabéns, você está pronto para avançar para o próximo nível");
                                    numQuestoes = 0;
                                    acertos = 0;
                                } else {
                                    System.out.println("Peça ajuda extra ao seu professor");
                                    numQuestoes = 0;
                                    acertos = 0;
                                }
                            }
                    }
                          if (dificuldade.equals("2")) {
                            while (numQuestoes < 10) {
                                numQuestoes++;
                                int numero1 = Dificuldade.nivel2();
                                int numero2 = Dificuldade.nivel2();
                                System.out.println(gerarPergunta(numero1, numero2));
                                int resposta = input.nextInt();
                                if (resposta != gerarResposta(numero1, numero2)) {
                                    System.out.println(FeedBack.feedNegativo());
                                }
                                if (resposta == gerarResposta(numero1, numero2)) {
                                    System.out.println(FeedBack.feedPositivo());
                                    acertos++;
                                }
                            }
                            if (numQuestoes == 10) {
                                    int porcentagem = (100 * acertos) / numQuestoes;
                                    System.out.println("Sua porcentagem de acertos: " + porcentagem + " %");
                                    if (porcentagem >= 75) {
                                        System.out.println("Parabéns, você está pronto para avançar para o próximo nível");
                                        numQuestoes = 0;
                                        acertos = 0;
                                    } else {
                                        System.out.println("Peça ajuda extra ao seu professor");
                                        numQuestoes = 0;
                                        acertos = 0;
                                    }
                                }
                        }
            System.out.println("Deseja continuar ?");
            escolha = input.next();
        }
    }



    public static int gerarResposta(int numero1, int numero2){
        int resultado = numero1 * numero2;
        return resultado;
    }

    public static String gerarPergunta(int numero1, int numero2){
        String pergunta = "Quanto é " + numero1 + " vezes " + numero2 + " ? ";
        return pergunta;
    }

}
