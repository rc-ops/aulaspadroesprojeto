package ted.aula05;

import java.util.ArrayList;
import java.util.List;

public class Tempo {
    private String horario;
    private String dia;
    private static final String[] diasSemana = {"SEGUNDA", "TERÇA", "TERCA", "QUARTA", "QUINTA",
            "SEXTA", "SÁBADO", "SABADO", "DOMINGO"};

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

    public static boolean checaDia(String dia){
        for (String diaSemana : diasSemana){
            if (diaSemana.equalsIgnoreCase(dia)){
                return true;
            }
        }
        return false;
    }
}
