package ted.aula03;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, String dataNascimento, String endereco, String cargo, int matricula, double salario, String dataAdmissao) {
        super(nome, dataNascimento, endereco, cargo);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(int matricula, double salario, String dataAdmissao) {
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(int matricula, double salario) {
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario(){

    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
