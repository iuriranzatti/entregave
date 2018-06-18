import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.List;

public class DigitalHouseManager {
    private List<Alunos> Alunos;
    private List<Professor> professores;
    private List<Curso> cursos;
    private List<Matricula> matriculas;

    public DigitalHouseManager(List<Alunos> alunos, List<Professor> professores, List<Curso> cursos, List<Matricula> matriculas) {
        setAlunos(alunos);
        this.setProfessores(professores);
        this.setCursos(cursos);
        this.setMatriculas(matriculas);
    }

    public List<Alunos> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Alunos> alunos) {
        Alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void excluirCurso(Curso curso) {
        this.cursos.remove(curso);
    }

    public void adicionarProfessor(Adjunto adjunto) {
        this.professores.add(adjunto);
    }

    public void adicionarProfessor(Titular titular) {
        this.professores.add(titular);
    }

    public void excluirProfessor(int cod) {

        for (Professor p : this.professores) {
            if (p.getCodigo() == cod) {
                professores.remove(p);
            }
        }
    }

    public void adicionarAluno(Alunos alunos) {
        this.Alunos.add(alunos);
    }

    public boolean verificarVaga(Curso curso) {
        if (curso.numAlunos() < curso.getQtdAluno()) {
            return true;
        }
        return false;
    }

    public void matricularAluno(Alunos alunos, Curso curso) {
        int codigoCurso = curso.getCodigo();
        int codigoAluno = alunos.getMatricula();
        for (Curso c : this.cursos) {
            if (c.getCodigo() == codigoCurso) {
                for (Alunos a : this.Alunos) {
                    if (a.getMatricula() == codigoAluno) {
                        try {
                            Calendar data = new Calendar.Builder().build();
                            Matricula m = new Matricula(alunos, curso, data);
                            matriculas.add(m);
                            System.out.println("Matricula realizada com sucesso!");
                        } catch (Exception e) {
                            System.out.println(e.toString());

                        }
                    } else {
                        System.out.println("A turma está lotada!!!");
                    }
                }
            }
        }
    }

    public boolean verificarProfessor(int codProf) {
        for (Professor p : this.professores) {
            if (codProf == p.getCodigo()) {
                return true;

            }

        }
        return false;

    }


    public int posicaoCurso(int codCurso) {
        return this.cursos.indexOf(codCurso);

    }

    public void alocarProfessor(int codCurso, int codTitular, int codAdjunto) {

        Titular titular = null;
        Adjunto adjunto = null;
        Curso curso = null;
        titular.setCodigo(codTitular);
        adjunto.setCodigo(codAdjunto);
        curso.setCodigo(codCurso);


        if (verificarProfessor(codAdjunto) && verificarProfessor(codTitular)) {
            if (cursos.contains(curso.getCodigo())) {
                try {
                    curso.setProfessorTitular(titular);
                    curso.setProfessorAdjunto(adjunto);

                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }
        else {
            System.out.println("Professor alocado ou Nao Exixtente");
        }

    }
}
