public class Titular extends Professor {
    private String especialidade;

    public Titular(String nome, String sobrenome, int codigo, int tempoDeCasa, String especialidade) {
        super(nome, sobrenome, codigo, tempoDeCasa);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
