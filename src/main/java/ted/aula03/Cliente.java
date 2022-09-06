package ted.aula03;

import java.util.Date;

public class Cliente extends Pessoa{
    private String codigo;
    private String profissao;

    public String getCodigo() {
        return codigo;
    }

    public Cliente(String nome, String dataNascimento, String endereco, String cargo, String codigo, String profissao) {
        super(nome, dataNascimento, endereco, cargo);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public Cliente(){}

    public Cliente(String codigo, String profissao) {
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
