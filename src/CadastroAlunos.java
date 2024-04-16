public class CadastroAlunos {

    private String nome;
    private int idade;
    private String instituicao;

    public CadastroAlunos(String nome, int idade, String instituicao) {
        this.nome = nome;
        this.idade = idade;
        this.instituicao = instituicao;
    }
    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
