package ted.aula05;

public class Produto {
    private double preco;
    private Tempo horarioCompra;

    public Produto(double preco, Tempo horarioCompra) {
        this.preco = preco;
        this.horarioCompra = horarioCompra;
    }

    public void calculoPreco(Double precoAntigo){
        if (extractTime(horarioCompra) >= 20 && (extractDay(horarioCompra).equalsIgnoreCase("Sábado"))) {
            System.out.println("O preço do produto apresenta 20% de desconto");
            System.out.println("Novo preço: R$" + (precoAntigo - (0.20 * precoAntigo)));
        } else if (extractTime(horarioCompra) >= 20 && (extractDay(horarioCompra).equalsIgnoreCase("Domingo"))) {
            System.out.println("O preço do produto apresenta 20% de desconto");
            System.out.println("Novo preço: R$" + (precoAntigo - (0.20 * precoAntigo)));
        } else if(extractDay(horarioCompra).equalsIgnoreCase("Sábado") || (extractDay(horarioCompra).equalsIgnoreCase("Domingo"))){
            System.out.println("O preço do produto apresenta 20% de desconto");
            System.out.println("Novo preço: R$" + (precoAntigo - (0.20 * precoAntigo)));
        } else{
            System.out.println("Infelizmente o produto não teve seu valor descontado");
            System.out.println("Preço: R$" + precoAntigo);
        }
    }

    private int extractTime(Tempo tempo){
        String horario = tempo.toString();
        String[] listaHorarios = horario.split(":");
        return Integer.parseInt(listaHorarios[0]);
    }

    private String extractDay(Tempo tempo){
        String dia = tempo.toString();
        String[] diaSemana = dia.split("Dia:");
        return diaSemana[1];
    }
}
