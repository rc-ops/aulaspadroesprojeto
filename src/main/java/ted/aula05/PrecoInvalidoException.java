package ted.aula05;

public class PrecoInvalidoException extends Exception{
    private double preco;
    public PrecoInvalidoException(Double preco){
        this.preco = preco;
    }

    @Override
    public String toString() {
        if (preco == 0){
            return "Preço inválido! Não temos nenhum produto gratuito na loja!";
        } else {
            return "Preço inválido. " + preco + " não é um valor aceitável.";
        }
    }
}
