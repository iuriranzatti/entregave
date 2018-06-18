public class Alunos {

    private String nome;
    private String sobrenome;
    private int matricula;

    public Alunos(String nome, String sobrenome, int matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
