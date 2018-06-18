import java.util.List;

public class Curso {
    private String nome;
    private Titular professorTitular;
    private Adjunto professorAdjunto;
    private int qtdAluno;

    public Curso(String nome, int qtdAluno, int codigo) {
        this.nome = nome;
        this.qtdAluno = qtdAluno;
        this.codigo = codigo;
    }

    private List<Alunos> alunos;
    private int codigo;

    public Curso(String nome, Titular professorTitular, Adjunto professorAdjunto, int qtdAluno, List<Alunos> alunos, int codigo) {
        this.setNome(nome);
        this.setProfessorTitular(professorTitular);
        this.setProfessorAdjunto(professorAdjunto);
        this.setQtdAluno(qtdAluno);
        this.setAlunos(alunos);
        this.setCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int numAlunos(){
        return this.alunos.size();
    }

    public Titular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Titular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Adjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Adjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getQtdAluno() {
        return qtdAluno;
    }

    public void setQtdAluno(int qtdAluno) {
        this.qtdAluno = qtdAluno;
    }

    public List<Alunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Alunos> alunos) {
        this.alunos = alunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean adicionarUmAluno(Alunos alunos) {
        try {
            this.alunos.add(alunos);
            return true;
        } catch (Exception e) {
        }
        return false;

    }
    public void excluirAluno(Alunos Alunos){
            this.alunos.remove(alunos);

    }
}