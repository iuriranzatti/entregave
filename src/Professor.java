public class Professor {
    private String nome;
    private String sobrenome;
    private int codigo;
    private int tempoDeCasa;

    public Professor(String nome, String sobrenome, int codigo, int tempoDeCasa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
        this.tempoDeCasa = tempoDeCasa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }
}
