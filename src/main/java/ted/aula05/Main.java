package ted.aula05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PrecoInvalidoException, DiaInvalidoException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o preço do produto R$: ");
        double preco = sc.nextDouble();
        if (preco <= 0)  throw new PrecoInvalidoException(preco);
        System.out.print("Dia da semana: ");
        String dia = sc.next();
        if (!Tempo.checaDia(dia)) throw new DiaInvalidoException(dia);
        System.out.print("Horário da compra, no formato (H:M:ss): ");
        String horario = sc.next();
        Tempo tempo = new Tempo(horario, dia);

        Produto produto = new Produto(preco, tempo);

        produto.calculoPreco(preco);
    }
}
