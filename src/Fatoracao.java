public class Fatoracao {

    public int fatorar(int fatorador) {
        int resultado = 1;

        for (int i = 1; i <= fatorador; i++) {
            System.out.println("Valor da fatoração: " + i);
            resultado *= i;
            System.out.println("Valor da fatoração resultado: " + resultado);
        }

        return resultado;
    }
}
