public class Adjunto extends Professor {

    private int horasMentoria;

    public Adjunto(String nome, String sobrenome, int codigo, int tempoDeCasa, int horasMentoria) {
        super(nome, sobrenome, codigo, tempoDeCasa);
        this.setHorasMentoria(horasMentoria);
    }

    public int getHorasMentoria() {
        return horasMentoria;
    }

    public void setHorasMentoria(int horasMentoria) {
        this.horasMentoria = horasMentoria;
    }
}
