package ted.aula03;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(4321, 1000);
        f1.setDataAdmissao("2022,05,04");
        f1.setTelsContato("5580989483321", "5583923190332");
        f1.setDataNascimento("1989,05,12");
        f1.setEndereco("Av. Ciranda cirandinha, 57 - Brasil");
        f1.setCargo("Atendente de telemarketing");

        System.out.println("Pertencente ao funcionário: " + f1.getMatricula());
        System.out.println("Herdado ao funcionário: " + f1.getEndereco());

        Cliente c1 = new Cliente("444", "Comprador");
        c1.setDataNascimento("1972,04,07");
        c1.setEndereco("Rua Asfaltada do amanhã, 58 - Brasil");
        System.out.println("Pertencente ao Cliente: " + c1.getCodigo());
        System.out.println("Herdado ao cliente:" + c1.getEndereco());
    }
}
