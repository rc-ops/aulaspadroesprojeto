package ted.aula05;

public class Tempo {
    private String horario;
    private String dia;

    public Tempo(String horario, String dia) {
        this.horario = horario;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return String.format("%s, Dia:%s" , getHorario(), getDia());
    }

    public String getHorario() {
        return horario;
    }

    public String getDia() {
        return dia;
    }
}
