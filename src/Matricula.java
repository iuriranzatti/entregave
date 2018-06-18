import java.util.Calendar;

public class Matricula {
    private Alunos aluno;
    private Curso curso;
    private Calendar dataMatricula;

    public Matricula(Alunos aluno, Curso curso, Calendar dataMatricula) {
        this.setAluno(aluno);
        this.setCurso(curso);
        this.setDataMatricula(dataMatricula);
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Calendar getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Calendar dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
