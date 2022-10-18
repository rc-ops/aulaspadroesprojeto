package ted.aula05;

public class DiaInvalidoException extends Exception{
    private final String dia;

    public DiaInvalidoException(String dia){
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "O dia inserido é inválido!";
    }
}
