package ted.aula03;

import java.util.ArrayList;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private ArrayList<String> telsContato = new ArrayList<>();
    private String cargo;

    private double salario;

    public Pessoa(String nome, String dataNascimento, String endereco, String cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cargo = cargo;
    }
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelsContato(ArrayList<String> telsContato) {
        this.telsContato = telsContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<String> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telefone1, String telefone2) {
        this.telsContato.add(telefone1);
        this.telsContato.add(telefone2);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    protected void cadastrar(){

    }

    protected void obterIdade(){
    }

    protected void reajustarSalario(double percentual){
        this.salario = this.getSalario()+percentual;
    }

    protected void promover(String novoCargo){
        this.cargo = novoCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
