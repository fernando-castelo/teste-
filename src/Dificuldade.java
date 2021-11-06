import java.security.SecureRandom;
public class Dificuldade {

    private static final SecureRandom random = new SecureRandom();

    public static int nivel1() {
        int num = random.nextInt(10);
        return num;
    }
    public static int nivel2(){
        int num = random.nextInt(100);
        return num;
    }
}
