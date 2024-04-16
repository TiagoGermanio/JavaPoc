import java.util.Random;

public class GeraSenha {

    private static final int senha_tamanho = 10;
    private static final Random random = new Random();
    private static final String senha_minuscula = "abcdefghijklmnopqrstuvwxyz";
    private static final String senha_maiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String digitos = "0123456789";
    private static final String simbolos = "!!@#$%^&*()_-+={}[]|;':\\\"<>,./?";

    public static String geradorDeSenhas() {
        StringBuilder criadorDeSenha = new StringBuilder();
        for (int i = 0; i < senha_tamanho; i++) {
            int categoryIndex = random.nextInt(4); // Choose a random category (lowercase, uppercase, digit, symbol)

            switch (categoryIndex) {
                case 0:
                    criadorDeSenha.append(senha_minuscula.charAt(random.nextInt(senha_minuscula.length())));
                    break;
                case 1:
                    criadorDeSenha.append(senha_maiuscula.charAt(random.nextInt(senha_maiuscula.length())));
                    break;
                case 2:
                    criadorDeSenha.append(digitos.charAt(random.nextInt(digitos.length())));
                    break;
                case 3:
                    criadorDeSenha.append(simbolos.charAt(random.nextInt(simbolos.length())));
                    break;
            }
        }

        return criadorDeSenha.toString();

    }

}
