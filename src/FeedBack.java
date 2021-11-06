import java.security.SecureRandom;
public class FeedBack {
    private static final SecureRandom random = new SecureRandom();

    public static String feedPositivo() {
        String[] feed1 = {"Muito bom!", "Excelente!", "Bom trabalho!", "Mantenha um bom trabalho!"};
        String feedEscolhido1 = feed1[random.nextInt(4)];
        return feedEscolhido1;
    }

    public static String feedNegativo() {
        String[] feed2 = {"Não. Por favor, tente de novo.","Errado. Tente mais uma vez.",
                "Não desista!","Não. Continue tentando."};
        String feedEscolhido2 = feed2[random.nextInt(4)];
        return feedEscolhido2;
    }
}
