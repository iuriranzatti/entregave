import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titular ProfTitular1 = new Titular("Iuri", "Serafim", 001, 3, "Android" );
        Titular ProfTitular2 = new Titular("Thiago","Simon", 002, 2, "Android");
        Adjunto ProfAdjunto1 = new Adjunto("Victor", "Caldas", 003, 5, 130);
        Adjunto ProfAdjunto2 = new Adjunto("Caio", "Ribeiro", 004, 6, 129);

        Curso curso01 = new Curso("Full Stack", 3, 2001);
        Curso curso02 = new Curso("Android", 2, 20002);

        curso01.setProfessorTitular(ProfTitular1);
        curso01.setProfessorAdjunto(ProfAdjunto1);
        curso02.setProfessorTitular(ProfTitular2);
        curso02.setProfessorAdjunto(ProfAdjunto2);

        Alunos aluno01 = new Alunos("Felipe", "Guedes", 66541);
        Alunos aluno02 = new Alunos("Amanda", "Silva", 34521);
        Alunos aluno03 = new Alunos("Jessica", "Almeida", 234567);
        Alunos aluno04 = new Alunos("Dentinho", "Pereira", 253648);

        curso01.adicionarUmAluno(aluno01);
        curso01.adicionarUmAluno(aluno02);

        curso02.adicionarUmAluno(aluno03);
        curso02.adicionarUmAluno(aluno04);

        System.out.println("Curso:" +curso01.getCodigo());
        System.out.println(curso01.getNome());
        System.out.println(ProfAdjunto1.getNome());
        System.out.println(curso01.getProfessorAdjunto());
        System.out.println(curso02.getAlunos());
        System.out.println(curso01.getProfessorTitular());
    }
}
