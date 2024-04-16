//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TestesJava testesJava = new TestesJava();
        Fatoracao fatoracao = new Fatoracao();
        Onca onca = new Onca();


        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }


        testesJava.soma(2,8);
        testesJava.subtrai(2,8);
        testesJava.divide(8,8);
        testesJava.multiplica(8,8);

        String password = GeraSenha.geradorDeSenhas();
        System.out.println("Senha Gerada: " + password);


        CadastroAlunos student1 = new CadastroAlunos("Alice", 10, "coezao");
        CadastroAlunos student2 = new CadastroAlunos("Bob", 8, "Escolita");


        System.out.print("Nome\t\tIdade\t\tInstituição\n");
        System.out.printf("%-15s\t%d\n", student1.getNome(), student1.getIdade(), student1.getInstituicao());
        System.out.printf("%-15s\t%d\n", student2.getNome(), student2.getIdade(), student2.getInstituicao());

        fatoracao.fatorar(8);

        onca.comerPresa();


    }


}